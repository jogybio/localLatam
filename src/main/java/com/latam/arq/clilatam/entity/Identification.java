package com.latam.arq.clilatam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="IDENTIFICATION")
public class Identification {
	
	
	@Id
	@Column(name = "IDENTIFICATION_CD")
	private int identificationCd;
	
	@Column(name = "IDENTIFICATION_DESC")
	private String identificationDesc;
	
	@Column(name = "IDENTIFICATION_TYPE_CD")
	private int identificationTypeCd;
	
	@Column(name = "IDENTIFICATION_COUNTRY_CD")
	private String identificationCountryCd;
	
	@Column(name = "IDENTIFICACTION_GROUP_CD")
	private int identificationGroupCd;

	public int getIdentificationCd() {
		return identificationCd;
	}

	public void setIdentificationCd(int identificationCd) {
		this.identificationCd = identificationCd;
	}

	public String getIdentificationDesc() {
		return identificationDesc;
	}

	public void setIdentificationDesc(String identificationDesc) {
		this.identificationDesc = identificationDesc;
	}

	public int getIdentificationTypeCd() {
		return identificationTypeCd;
	}

	public void setIdentificationTypeCd(int identificationTypeCd) {
		this.identificationTypeCd = identificationTypeCd;
	}

	public String getIdentificationCountryCd() {
		return identificationCountryCd;
	}

	public void setIdentificationCountryCd(String identificationCountryCd) {
		this.identificationCountryCd = identificationCountryCd;
	}

	public int getIdentificationGroupCd() {
		return identificationGroupCd;
	}

	public void setIdentificationGroupCd(int identificationGroupCd) {
		this.identificationGroupCd = identificationGroupCd;
	}

	@Override
	public String toString() {
		return "Identification [identificationCd=" + identificationCd + ", identificationDesc=" + identificationDesc
				+ ", identificationTypeCd=" + identificationTypeCd + ", identificationCountryCd="
				+ identificationCountryCd + ", identificationGroupCd=" + identificationGroupCd + "]";
	}

	public Identification(int identificationCd, String identificationDesc, int identificationTypeCd,
			String identificationCountryCd, int identificationGroupCd) {
		super();
		this.identificationCd = identificationCd;
		this.identificationDesc = identificationDesc;
		this.identificationTypeCd = identificationTypeCd;
		this.identificationCountryCd = identificationCountryCd;
		this.identificationGroupCd = identificationGroupCd;
	}
	
	public Identification() {}
	
	
}
