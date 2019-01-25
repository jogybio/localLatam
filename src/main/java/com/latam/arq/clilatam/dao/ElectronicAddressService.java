package com.latam.arq.clilatam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.ElectronicAddress;

@Service("electronicAddressService")
public class ElectronicAddressService {

	
	@Autowired
    @Qualifier("electronicAddressRepository")
	ElectronicAddressRepository eaDao;
	
	public List<ElectronicAddress> findElectronicAddress(int eaId) {	
		return   eaDao.findElectronicAddress(eaId);
		
	}

}
