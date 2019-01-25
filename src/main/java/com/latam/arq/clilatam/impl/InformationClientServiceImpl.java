package com.latam.arq.clilatam.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.dao.AddressService;
import com.latam.arq.clilatam.dao.ElectronicAddressService;
import com.latam.arq.clilatam.dao.IndividualService;
import com.latam.arq.clilatam.dao.PartyAddressHistoryService;
import com.latam.arq.clilatam.domain.InformationClient;
import com.latam.arq.clilatam.entity.Address;
import com.latam.arq.clilatam.entity.ElectronicAddress;
import com.latam.arq.clilatam.entity.Individual;
import com.latam.arq.clilatam.entity.PartyAddresHistory;

@Service("informationClientService")
public class InformationClientServiceImpl {
	
	
	@Autowired
	@Qualifier("electronicAddressService")
	ElectronicAddressService electronicAddressService;

	@Autowired
	@Qualifier("partyAddressHistoryService")
	PartyAddressHistoryService partyAddressHistoryService;
	
	@Autowired
	@Qualifier("addressService")
	AddressService addressService;
	
	@Autowired
	@Qualifier("individualService")
	IndividualService individualService;
	
	
	public List<InformationClient> obtainInformationClientProcess(int partyId) {
		List<InformationClient> listInformation = new ArrayList<InformationClient>();
		
		InformationClient informationClient = new InformationClient();
		Individual individual = obtainBirthDate(partyId);
		   informationClient.setCelPhone("9 XXXX XXXX");
		  // partyAddressHistoryService.findAddressClient(partyId);
		   informationClient.setBirthDate(individual.getBirthDt().toString());
		   informationClient.setGender(individual.getGenderTypeCd());
		   informationClient.setEmail(obtainElectoricAddress(partyId));
		   informationClient.setGeoAddress(" XXXXXXX ");
		   informationClient.setPhone("22 XXXX XXXX");
		   		
		       listInformation.add(informationClient);
		       
		return listInformation;

	}

	private Individual obtainBirthDate(int partyId) {
		 
		Individual individual = individualService.findIndividuals(partyId);
		
		return individual;
	}

	private String obtainElectoricAddress(int partyId) {
		String email= "";  
	
		List<PartyAddresHistory> listAddressHistory  = new ArrayList<PartyAddresHistory>();
		List<Address> listAddress = new ArrayList<>();
		
		listAddressHistory =  partyAddressHistoryService.findAddress(partyId);
		 
		listAddress = obtainAddressValid(listAddressHistory);
		
		List<ElectronicAddress> electronicAddress =  electronicAddressService.findElectronicAddress(listAddress.get(0).getAddressId());
		  
		return electronicAddress.get(0).getElectronicAddressTxt();	
	}

	private List<Address> obtainAddressValid(List<PartyAddresHistory> listAddressHistory) {
		List<Address> listAddress = new ArrayList<Address>();
			for (PartyAddresHistory partyAddresHistory : listAddressHistory) {
				Address address =new  Address();
				
				address	=	addressService.findValidAddress(partyAddresHistory.getAddressId());
			
				listAddress.add(address);
			}
		
		return listAddress;
	}

}
