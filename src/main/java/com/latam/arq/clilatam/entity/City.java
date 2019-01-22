package com.latam.arq.clilatam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CITY")
public class City {
	
	@Id
	@Column(name = "CITY_CD")
	private String cityCd;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "TERRITORY_CD")
	private String territoryCd;
	
	@Column(name = "COUNTY_CD")
	private String countryCd;
	
	@Column(name = "CITY_IATA_CD")
	private String cityIataCd;

	
	
	public String getCityCd() {
		return cityCd;
	}



	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public String getTerritoryCd() {
		return territoryCd;
	}



	public void setTerritoryCd(String territoryCd) {
		this.territoryCd = territoryCd;
	}



	public String getCountryCd() {
		return countryCd;
	}



	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}



	public String getCityIataCd() {
		return cityIataCd;
	}



	public void setCityIataCd(String cityIataCd) {
		this.cityIataCd = cityIataCd;
	}


	

	@Override
	public String toString() {
		return "City [cityCd=" + cityCd + ", cityName=" + cityName + ", territoryCd=" + territoryCd + ", countryCd="
				+ countryCd + ", cityIataCd=" + cityIataCd + "]";
	}

	


	public City(String cityCd, String cityName, String territoryCd, String countryCd, String cityIataCd) {
		super();
		this.cityCd = cityCd;
		this.cityName = cityName;
		this.territoryCd = territoryCd;
		this.countryCd = countryCd;
		this.cityIataCd = cityIataCd;
	}



	public City() {}

}
