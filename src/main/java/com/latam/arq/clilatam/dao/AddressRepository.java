package com.latam.arq.clilatam.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.Address;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Serializable>{

	
	@Query(value="select * from EXCDR.ADDRESS AD where AD.ADDRESS_ID = :addId and AD.ADDRESS_TYPE_CD= 2",nativeQuery=true)
	public Address validAddressId(@Param("addId") int addId);

}
