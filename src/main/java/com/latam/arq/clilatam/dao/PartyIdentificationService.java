package com.latam.arq.clilatam.dao;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.PartyIdentification;

@Service("partyIdentificationService")
public class PartyIdentificationService {
	
	public static final Logger logger = LoggerFactory.getLogger(PartyIdentificationService.class);
	
	@Autowired
    @Qualifier("partyIdentificationRepository")
	PartyIdentificationRepository partiIdenDao;	


	public List<PartyIdentification> findPartyId(String ffNumber) {
		PartyIdentification identification =new PartyIdentification();
		logger.info("ffNumber  " +ffNumber);
		List<PartyIdentification> partyList = new ArrayList<PartyIdentification>();		
		partyList.addAll(partiIdenDao.findPartiIdByffNumber(ffNumber));
		
		logger.info("identification " +partyList.toString());
		return partyList;
	}
}
