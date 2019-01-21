package com.latam.arq.clilatam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ADDRESS")
public class Address {
	
	@Id
	@Column(name = "ADDRESS_ID")
	private int addressId;
	
	@Column(name = "PARTY_ID")
	private String partyId;
	
	@Column(name = "ADDRESS_USE_CD")
	private int addressUseCd;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public int getAddressUseCd() {
		return addressUseCd;
	}

	public void setAddressUseCd(int addressUseCd) {
		this.addressUseCd = addressUseCd;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", partyId=" + partyId + ", addressUseCd=" + addressUseCd + "]";
	}

	public Address(int addressId, String partyId, int addressUseCd) {
		super();
		this.addressId = addressId;
		this.partyId = partyId;
		this.addressUseCd = addressUseCd;
	}
	
	public Address() {}
	

}
