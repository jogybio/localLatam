package com.latam.arq.clilatam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Null;

@Entity
@Table (name="ELECTRONIC_ADDRESS")
public class ElectronicAddress implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3076857547522667782L;

	@Id            
	@Column(name= "ELECTRONIC_ADDRESS_ID")
	private long electronicAddressId;
	                
	@Column(name = "ELECTRONIC_ADDRESS_TXT")
	private String electronicAddressTxt;
	         
	@Column(name = "ELECTRONIC_ADDRESS_DOMAIN_NAME")
	private String electronicAddressDomainName;
	                
	@Column(name = "ELECTRONIC_ADDRESS_TYPE_CD")
	private Integer electronicAddressTypeCd;
	                
	@Column(name = "EMAIL_TEXT_FORMAT_IND")
	private String emailTextFormatInd;

	public long getElectronicAddressId() {
		return electronicAddressId;
	}

	public void setElectronicAddressId(Integer electronicAddressId) {
		this.electronicAddressId = electronicAddressId;
	}

	public String getElectronicAddressTxt() {
		return electronicAddressTxt;
	}

	public void setElectronicAddressTxt(String electronicAddressTxt) {
		this.electronicAddressTxt = electronicAddressTxt;
	}

	public String getElectronicAddressDomainName() {
		return electronicAddressDomainName;
	}

	public void setElectronicAddressDomainName(String electronicAddressDomainName) {
		this.electronicAddressDomainName = electronicAddressDomainName;
	}

	public Integer getElectronicAddressTypeCd() {
		return electronicAddressTypeCd;
	}

	public void setElectronicAddressTypeCd(Integer electronicAddressTypeCd) {
		this.electronicAddressTypeCd = electronicAddressTypeCd;
	}

	public String getEmailTextFormatInd() {
		return emailTextFormatInd;
	}

	public void setEmailTextFormatInd(String emailTextFormatInd) {
		this.emailTextFormatInd = emailTextFormatInd;
	}



	public ElectronicAddress() {}
}
