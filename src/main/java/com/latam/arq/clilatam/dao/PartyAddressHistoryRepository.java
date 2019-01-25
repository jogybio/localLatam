package com.latam.arq.clilatam.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.PartyAddresHistory;


@Repository("partyAddressHistoryRepository")
public interface PartyAddressHistoryRepository extends JpaRepository<PartyAddresHistory, Serializable>{

		
	@Query(value="select * from EXCDR.PARTY_ADDRESS_HISTORY PAH WHERE PAH.PARTY_ID = :partyId",nativeQuery=true)
	public List<PartyAddresHistory> findAddressClient(@Param("partyId") int partyId);
	
	
}
