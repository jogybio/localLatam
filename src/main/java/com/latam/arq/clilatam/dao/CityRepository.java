package com.latam.arq.clilatam.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.City;

@Repository("cityRepository")
public interface CityRepository extends JpaRepository<City, Serializable>{

	
	@Query(value="SELECT * FROM EXCDR.city Ci WHERE Ci.city_cd = :id",nativeQuery=true)
	public City findCityByCityId(@Param("id") String id);


}
