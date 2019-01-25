package com.latam.arq.clilatam.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.Individual;

@Service("individualService")
public class IndividualService {	
	
	@Autowired
    @Qualifier("individualRepository")
	IndividualRepository individualDao;
	
	public Individual findIndividuals(long partyId) {
		return individualDao.findIndividuals(partyId);
	}


}
