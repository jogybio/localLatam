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
	private int cityCd;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "COUNTRY_CD")
	private int countryCd;

	public int getCityCd() {
		return cityCd;
	}

	public void setCityCd(int cityCd) {
		this.cityCd = cityCd;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(int countryCd) {
		this.countryCd = countryCd;
	}

	@Override
	public String toString() {
		return "City [cityCd=" + cityCd + ", cityName=" + cityName + ", countryCd=" + countryCd + "]";
	}

	public City(int cityCd, String cityName, int countryCd) {
		super();
		this.cityCd = cityCd;
		this.cityName = cityName;
		this.countryCd = countryCd;
	}
	
	public City() {}

}
