package com.latam.arq.clilatam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ELECTRONIC_ADDRESS")
public class ElectronicAddress {
	
	
	@Id
	@Column(name= "ELECTRONIC_ADDRESS_ID")
	private int electronicAddressId;
		
	@Column(name = "ELECTRONIC_ADDRESS_TXT")
	private String electronicAddressTxt;
	
	@Column(name = "ELECTRONIC_ADDRESS_DOMAIN_NAME")
	private String electronicAddressDomainName;
	
	@Column(name = "ELECTRONIC_ADDRESS_TYPE_CD")
	private int electronicAddressTypeCd;
	
	@Column(name = "EMAIL_TEXT_FOMAT_IND")
	private String emailTextFormatInd;

	public int getElectronicAddressId() {
		return electronicAddressId;
	}

	public void setElectronicAddressId(int electronicAddressId) {
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

	public int getElectronicAddressTypeCd() {
		return electronicAddressTypeCd;
	}

	public void setElectronicAddressTypeCd(int electronicAddressTypeCd) {
		this.electronicAddressTypeCd = electronicAddressTypeCd;
	}

	public String getEmailTextFormatInd() {
		return emailTextFormatInd;
	}

	public void setEmailTextFormatInd(String emailTextFormatInd) {
		this.emailTextFormatInd = emailTextFormatInd;
	}

	@Override
	public String toString() {
		return "ElectronicAddress [electronicAddressId=" + electronicAddressId + ", electronicAddressTxt="
				+ electronicAddressTxt + ", electronicAddressDomainName=" + electronicAddressDomainName
				+ ", electronicAddressTypeCd=" + electronicAddressTypeCd + ", emailTextFormatInd=" + emailTextFormatInd
				+ "]";
	}

	public ElectronicAddress(int electronicAddressId, String electronicAddressTxt, String electronicAddressDomainName,
			int electronicAddressTypeCd, String emailTextFormatInd) {
		super();
		this.electronicAddressId = electronicAddressId;
		this.electronicAddressTxt = electronicAddressTxt;
		this.electronicAddressDomainName = electronicAddressDomainName;
		this.electronicAddressTypeCd = electronicAddressTypeCd;
		this.emailTextFormatInd = emailTextFormatInd;
	}
	

	public ElectronicAddress() {}
}
