package com.latam.arq.clilatam.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.City;

@Service("cityService")
public class CityService {	
	
	@Autowired
    @Qualifier("cityRepository")
	CityRepository clientDao;
	
	
	
	public City findCityByCityId(int id) {
		return clientDao.findCityByCityId(id);
	}


}
