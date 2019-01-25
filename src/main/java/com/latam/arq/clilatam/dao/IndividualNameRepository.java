package com.latam.arq.clilatam.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.IndividualNameHistory;

@Repository("individualNameRepository")
public interface IndividualNameRepository extends JpaRepository<IndividualNameHistory, Serializable>{

	
	@Query(value="SELECT * FROM EXCDR.INDIVIDUAL_NAME_HISTORY IND WHERE IND.INDIVIDUAL_PARTY_ID = :id and IND.NAME_TYPE_CD = 1 order by IND.INDIVIDUAL_NAME_START_DTTM desc",nativeQuery=true)
	public IndividualNameHistory findIndividualName(@Param("id") long id);


}
