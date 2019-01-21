package com.latam.arq.clilatam.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="INDIVIDUAL")
public class Individual {
	
	@Id
	@Column(name = "INDIVIDUAL_PARTY_ID")
	private int individualPartyId;
	
	@Column(name = "GENDER_TYPE_CD")
	private String genderTypeCd;
	
	@Column(name = "INDI_COUNTRY_CD")
	private String indiCountryCd;
	
	@Column(name = "BIRTH_DT")
	private Date birthDt;

	public int getIndividualPartyId() {
		return individualPartyId;
	}

	public void setIndividualPartyId(int individualPartyId) {
		this.individualPartyId = individualPartyId;
	}

	public String getGenderTypeCd() {
		return genderTypeCd;
	}

	public void setGenderTypeCd(String genderTypeCd) {
		this.genderTypeCd = genderTypeCd;
	}

	public String getIndiCountryCd() {
		return indiCountryCd;
	}

	public void setIndiCountryCd(String indiCountryCd) {
		this.indiCountryCd = indiCountryCd;
	}

	public Date getBirthDt() {
		return birthDt;
	}

	public void setBirthDt(Date birthDt) {
		this.birthDt = birthDt;
	}

	@Override
	public String toString() {
		return "Individual [individualPartyId=" + individualPartyId + ", genderTypeCd=" + genderTypeCd
				+ ", indiCountryCd=" + indiCountryCd + ", birthDt=" + birthDt + "]";
	}

	public Individual(int individualPartyId, String genderTypeCd, String indiCountryCd, Date birthDt) {
		super();
		this.individualPartyId = individualPartyId;
		this.genderTypeCd = genderTypeCd;
		this.indiCountryCd = indiCountryCd;
		this.birthDt = birthDt;
	}
	
	public Individual() {}

}
