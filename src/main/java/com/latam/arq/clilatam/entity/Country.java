package com.latam.arq.clilatam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="COUNTRY")
public class Country {

	@Id
	@Column(name = "COUNTRY_CD")
	private String countryCd;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "TERRITORY_CD")
	private String territoryCd;

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getTerritoryCd() {
		return territoryCd;
	}

	public void setTerritoryCd(String territoryCd) {
		this.territoryCd = territoryCd;
	}

	@Override
	public String toString() {
		return "Country [countryCd=" + countryCd + ", countryName=" + countryName + ", territoryCd=" + territoryCd
				+ "]";
	}

	public Country(String countryCd, String countryName, String territoryCd) {
		super();
		this.countryCd = countryCd;
		this.countryName = countryName;
		this.territoryCd = territoryCd;
	}
	
	public Country() {}
}
