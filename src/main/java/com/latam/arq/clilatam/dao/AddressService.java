package com.latam.arq.clilatam.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.Address;

@Service("addressService")
public class AddressService {

	
	public static final Logger logger = LoggerFactory.getLogger(AddressService.class);
	
		@Autowired
	    @Qualifier("addressRepository")
		AddressRepository addressDao;
		
		
		
		public Address findValidAddress(int addId) {	
			Address add = new Address();
			add= addressDao.validAddressId(addId);
			return   add;
			
		}
	
}
