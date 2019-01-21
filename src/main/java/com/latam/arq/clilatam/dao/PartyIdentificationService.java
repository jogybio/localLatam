package com.latam.arq.clilatam.dao;



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


	public int findPartyId(String ffNumber) {
		PartyIdentification identification =new PartyIdentification();
		logger.info("ffNumber  " +ffNumber);
		identification= partiIdenDao.findPartiIdByffNumber(ffNumber);
		logger.info("identification " +identification.toString());
		return identification.getPartyId();
	}
}
