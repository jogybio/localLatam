package com.latam.arq.clilatam.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.IndividualNameHistory;

@Service("individualNameService")
public class IndividualNameService {	
	
	@Autowired
    @Qualifier("individualNameRepository")
	IndividualNameRepository individualNameDao;
	
	
	
	public IndividualNameHistory findIndividualName(long id) {
		return individualNameDao.findIndividualName(id);
	}


}
