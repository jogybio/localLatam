package com.latam.arq.clilatam.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.PartyIdentification;

@Repository("partyIdentificationRepository")
public interface PartyIdentificationRepository extends JpaRepository<PartyIdentification, Serializable>{
	
	
	
	@Query(value="SELECT * FROM mydb.PARTY_IDENTIFICATION PI WHERE PARTY_IDENTIFICATION_NUM_CLEAN = :ffNumber",nativeQuery=true)
	public PartyIdentification findPartiIdByffNumber(@Param("ffNumber") String ffNumber);

}
