package com.latam.arq.clilatam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="INDIVIDUAL_NAME_HISTORY")
public class IndividualNameHistory implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5051582564050645689L;

	@Id
	@Column(name = "INDIVIDUAL_PARTY_ID")
	private String individualPartyId;
	
	@Column(name = "NAME_TYPE_CD")
	private String nameTypeCd;
	
	@Column(name = "INDIVIDUAL_NAME_START_DTTM")
	private String individualNameStartDttm;
	
	@Column(name = "FIRST_NAME")
	private String firtsName;
	
	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "SECOND_LAST_NAME")
	private String secondLastName;

	@Column(name = "INDIVIDUAL_PREFIX_TYPE_CD")
	private String individualPrefixTypeCd;

	@Column(name = "NAME_SUFFIX_TXT")
	private String nameSuffixTxt;
	
	@Column(name = "FIRST_NAME_SOUNDEX_VAL")
	private String firstNameSoundexVal;

	@Column(name = "MIDDLE_NAME_SOUNDEX_VAL")
	private String middleNameSoundexVal;

	@Column(name = "LAST_NAME_SOUNDEX_VAL")
	private String lastNameSoundexVal;

	@Column(name = "SECOND_LAST_NAME_SOUNDEX_VAL")
	private String secondLastNameSoundexVal;
	
	@Column(name = "INDIVIDUAL_NAME_END_DTTM")
	private String individualNameEndDttm;

	public String getIndividualPartyId() {
		return individualPartyId;
	}

	public void setIndividualPartyId(String individualPartyId) {
		this.individualPartyId = individualPartyId;
	}

	public String getNameTypeCd() {
		return nameTypeCd;
	}

	public void setNameTypeCd(String nameTypeCd) {
		this.nameTypeCd = nameTypeCd;
	}

	public String getIndividualNameStartDttm() {
		return individualNameStartDttm;
	}

	public void setIndividualNameStartDttm(String individualNameStartDttm) {
		this.individualNameStartDttm = individualNameStartDttm;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getIndividualPrefixTypeCd() {
		return individualPrefixTypeCd;
	}

	public void setIndividualPrefixTypeCd(String individualPrefixTypeCd) {
		this.individualPrefixTypeCd = individualPrefixTypeCd;
	}

	public String getNameSuffixTxt() {
		return nameSuffixTxt;
	}

	public void setNameSuffixTxt(String nameSuffixTxt) {
		this.nameSuffixTxt = nameSuffixTxt;
	}

	public String getFirstNameSoundexVal() {
		return firstNameSoundexVal;
	}

	public void setFirstNameSoundexVal(String firstNameSoundexVal) {
		this.firstNameSoundexVal = firstNameSoundexVal;
	}

	public String getMiddleNameSoundexVal() {
		return middleNameSoundexVal;
	}

	public void setMiddleNameSoundexVal(String middleNameSoundexVal) {
		this.middleNameSoundexVal = middleNameSoundexVal;
	}

	public String getLastNameSoundexVal() {
		return lastNameSoundexVal;
	}

	public void setLastNameSoundexVal(String lastNameSoundexVal) {
		this.lastNameSoundexVal = lastNameSoundexVal;
	}

	public String getSecondLastNameSoundexVal() {
		return secondLastNameSoundexVal;
	}

	public void setSecondLastNameSoundexVal(String secondLastNameSoundexVal) {
		this.secondLastNameSoundexVal = secondLastNameSoundexVal;
	}

	public String getIndividualNameEndDttm() {
		return individualNameEndDttm;
	}

	public void setIndividualNameEndDttm(String individualNameEndDttm) {
		this.individualNameEndDttm = individualNameEndDttm;
	}

	
	
	
	
	
	
	
	
	
	

}
