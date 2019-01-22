package com.latam.arq.clilatam.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.ElectronicAddress;


@Repository("partyAddressHistoryRepository")
public interface PartyAddressHistoryRepository extends JpaRepository<ElectronicAddress, Serializable>{

		
	@Query(value="SELECT * FROM EXCDR.ELECTRONIC_ADDRESS EA WHERE EA.ELECTRONIC_ADDRESS_ID = :partyId",nativeQuery=true)
	public List<ElectronicAddress> findAddressClient(@Param("partyId") String partyId);
	
	
}
