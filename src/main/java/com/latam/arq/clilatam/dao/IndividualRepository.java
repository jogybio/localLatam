package com.latam.arq.clilatam.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.Individual;

@Repository("individualRepository")
public interface IndividualRepository extends JpaRepository<Individual, Serializable>{

	
	@Query(value="SELECT * FROM EXCDR.INDIVIDUAL IND WHERE IND.INDIVIDUAL_PARTY_ID = :id",nativeQuery=true)
	public Individual findIndividuals(@Param("id") long id);


}
