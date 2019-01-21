package com.latam.arq.clilatam.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PARTY_IDENTIFICATION")
public class PartyIdentification {

	
	@Id
	@Column(name = "PARTY_ID")
	private int partyId;
	
	@Column(name = "IDENTIFICATION_CD")
	private int identificationCd;
	
	@Column(name = "PARTY_IDENTIFICATION_NUM")
	private String partyIdentificationNum;
	
	@Column(name = "PARTY_IDENTIFICATION_EXPIRY_DT")
	private Date partyIdentificationExpiryDt;
	
	@Column(name = "PARTY_IDENTIFICATION_NUM_CLEAN")
	private String partyIdentificationNumClean;
	
	

	
	public int getPartyId() {
		return partyId;
	}


	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}


	public int getIdentificationCd() {
		return identificationCd;
	}


	public void setIdentificationCd(int identificationCd) {
		this.identificationCd = identificationCd;
	}


	public String getPartyIdentificationNum() {
		return partyIdentificationNum;
	}


	public void setPartyIdentificationNum(String partyIdentificationNum) {
		this.partyIdentificationNum = partyIdentificationNum;
	}


	public Date getPartyIdentificationExpiryDt() {
		return partyIdentificationExpiryDt;
	}


	public void setPartyIdentificationExpiryDt(Date partyIdentificationExpiryDt) {
		this.partyIdentificationExpiryDt = partyIdentificationExpiryDt;
	}


	public String getPartyIdentificationNumClean() {
		return partyIdentificationNumClean;
	}


	public void setPartyIdentificationNumClean(String partyIdentificationNumClean) {
		this.partyIdentificationNumClean = partyIdentificationNumClean;
	}


	public PartyIdentification(int partyId, int identificationCd, String partyIdentificationNum,
			Date partyIdentificationExpiryDt, String partyIdentificationNumClean) {
		super();
		this.partyId = partyId;
		this.identificationCd = identificationCd;
		this.partyIdentificationNum = partyIdentificationNum;
		this.partyIdentificationExpiryDt = partyIdentificationExpiryDt;
		this.partyIdentificationNumClean = partyIdentificationNumClean;
	}


	@Override
	public String toString() {
		return "PartyIdentification [partyId=" + partyId + ", identificationCd=" + identificationCd
				+ ", partyIdentificationNum=" + partyIdentificationNum + ", partyIdentificationExpiryDt="
				+ partyIdentificationExpiryDt + ", partyIdentificationNumClean=" + partyIdentificationNumClean + "]";
	}




	public PartyIdentification(){}
	
	
}
