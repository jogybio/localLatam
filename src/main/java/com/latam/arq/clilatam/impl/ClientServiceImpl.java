package com.latam.arq.clilatam.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.dao.CityService;
import com.latam.arq.clilatam.dao.IndividualNameService;
import com.latam.arq.clilatam.dao.PartyIdentificationService;
import com.latam.arq.clilatam.domain.Client;
import com.latam.arq.clilatam.domain.Request;
import com.latam.arq.clilatam.entity.IndividualNameHistory;
import com.latam.arq.clilatam.entity.PartyIdentification;
import com.latam.arq.clilatam.service.IClientService;

@Service("clientServiceImpl")
public class ClientServiceImpl implements IClientService {

	public static final Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);
	
    @Autowired
    @Qualifier("cityService")
    public CityService cityService;
    
    @Autowired
    @Qualifier("partyIdentificationService")
    public PartyIdentificationService partyIdentificationService;
    
    @Autowired
    @Qualifier("informationClientService")
    public InformationClientServiceImpl informationClientService;
    
    @Autowired
    @Qualifier("individualNameService")
    public IndividualNameService individualNameService;
    
    
 
	@Override
	public List<Client> obtainClientProcess(Request request) {
		List<Client> lisClient = new ArrayList<Client>();
		Client client = new Client();
		List<PartyIdentification> partyIdenList = partyIdentificationService.findPartyId(request.getFfNumber());
		
		for (PartyIdentification partyIdentification : partyIdenList) {		
			client = new Client();
			
			client.setFfNumber(request.getFfNumber());
			client.setCity(cityService.findCityByCityId(1).getCityName());			
			
	        client.setInformation(informationClientService.obtainInformationClientProcess(partyIdentification.getPartyId()));
	        IndividualNameHistory individualName = individualNameService.findIndividualName(partyIdentification.getPartyId());
	        client.setLastName(individualName.getLastName());
			client.setName(individualName.getFirtsName());
			client.setPartyId(partyIdentification.getPartyId());
			logger.info(client.toString());		
			lisClient.add(client);
		}	
		
		
		return lisClient;
	}


}
