package com.latam.arq.clilatam.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.PartyIdentification;

@Repository("partyIdentificationRepository")
public interface PartyIdentificationRepository extends JpaRepository<PartyIdentification, Serializable>{
	
	
	
	@Query(value="SELECT PI.PARTY_ID, PI.IDENTIFICATION_CD, PI.PARTY_IDENTIFICATION_NUM, PI.PARTY_IDENTIFICATION_EXPIRY_DT,PI.PARTY_IDENTIFICATION_NUM_CLEAN FROM EXCDR.PARTY_IDENTIFICATION PI WHERE EXCDR.PI.PARTY_IDENTIFICATION_NUM_CLEAN =:ffNumber and EXCDR.PI.identification_cd = 41",nativeQuery=true)
	public List<PartyIdentification> findPartiIdByffNumber(@Param("ffNumber") String ffNumber);

}
