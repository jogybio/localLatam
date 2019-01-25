package com.latam.arq.clilatam.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.latam.arq.clilatam.entity.ElectronicAddress;

@Repository("electronicAddressRepository")
public interface ElectronicAddressRepository extends JpaRepository<ElectronicAddress, Serializable>{
	

		
		@Query(value="SELECT EA.ELECTRONIC_ADDRESS_ID,EA.ELECTRONIC_ADDRESS_TXT,EA.ELECTRONIC_ADDRESS_DOMAIN_NAME,EA.ELECTRONIC_ADDRESS_TYPE_CD,EA.EMAIL_TEXT_FORMAT_IND  FROM EXCDR.ELECTRONIC_ADDRESS EA WHERE EA.ELECTRONIC_ADDRESS_ID = :eaId",nativeQuery=true)
		public List<ElectronicAddress> findElectronicAddress(@Param("eaId") int eaId);
	

}
