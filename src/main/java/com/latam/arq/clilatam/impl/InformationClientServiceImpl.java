package com.latam.arq.clilatam.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.domain.InformationClient;

@Service("informationClientService")
public class InformationClientServiceImpl {

	public List<InformationClient> obtainInformationClientProcess(int partyId) {
		List<InformationClient> listInformation = new ArrayList<InformationClient>();
		
		InformationClient informationClient = new InformationClient();
		
		   informationClient.setCelPhone("9 XXXX XXXX");
		  // partyAddressHistoryService.findAddressClient(partyId);
		  // electronicAddressService.findElectronicAddress(partyId);
		   informationClient.setEmail("XXXXXALEZ@gmail.com");
		   informationClient.setGeoAddress(" XXXXXXX ");
		   informationClient.setPhone("22 XXXX XXXX");
		   
		   
		       
		
		       listInformation.add(informationClient);
		       
		return listInformation;

	}

}
