package com.latam.arq.clilatam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="GEOGRAPHY_ADDRESS")
public class GeographyAddres {
	
	
	@Id
	@Column(name = "GEOGRAPHY_ADDRESS_ID")
	private int geographyAddressId; 
	
	@Column(name = "ADDRESS_LINE_1_TXT")
	private int addressLine1Txt; 
	
	@Column(name = "TERRITORY_CD")
	private String territoryCd; 
	
	@Column(name = "COUNTRY_CD")
	private int countryCd; 
	
	@Column(name = "POSTAL_CD")
	private String postalCd; 
	
	@Column(name = "CITY_CD")
	private String cityCd;

	public int getGeographyAddressId() {
		return geographyAddressId;
	}

	public void setGeographyAddressId(int geographyAddressId) {
		this.geographyAddressId = geographyAddressId;
	}

	public int getAddressLine1Txt() {
		return addressLine1Txt;
	}

	public void setAddressLine1Txt(int addressLine1Txt) {
		this.addressLine1Txt = addressLine1Txt;
	}

	public String getTerritoryCd() {
		return territoryCd;
	}

	public void setTerritoryCd(String territoryCd) {
		this.territoryCd = territoryCd;
	}

	public int getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(int countryCd) {
		this.countryCd = countryCd;
	}

	public String getPostalCd() {
		return postalCd;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public String getCityCd() {
		return cityCd;
	}

	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}

	public GeographyAddres(int geographyAddressId, int addressLine1Txt, String territoryCd, int countryCd,
			String postalCd, String cityCd) {
		super();
		this.geographyAddressId = geographyAddressId;
		this.addressLine1Txt = addressLine1Txt;
		this.territoryCd = territoryCd;
		this.countryCd = countryCd;
		this.postalCd = postalCd;
		this.cityCd = cityCd;
	} 
	
	
	public GeographyAddres() {}
	
	
}
