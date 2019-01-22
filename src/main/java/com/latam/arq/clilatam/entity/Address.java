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
	
	@Column(name = "ADDRESS_TYPE_CD")
	private String addressTypeCd;
	
	@Column(name = "ADDRESS_STATUS_TYPE_CD")
	private int addressStatusTypeCd;
	
	@Column(name = "ADDRESS_STATUS_REASON_CD")
	private int addressStatusReasonCd;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressTypeCd() {
		return addressTypeCd;
	}

	public void setAddressTypeCd(String addressTypeCd) {
		this.addressTypeCd = addressTypeCd;
	}

	public int getAddressStatusTypeCd() {
		return addressStatusTypeCd;
	}

	public void setAddressStatusTypeCd(int addressStatusTypeCd) {
		this.addressStatusTypeCd = addressStatusTypeCd;
	}

	public int getAddressStatusReasonCd() {
		return addressStatusReasonCd;
	}

	public void setAddressStatusReasonCd(int addressStatusReasonCd) {
		this.addressStatusReasonCd = addressStatusReasonCd;
	}
	
	
	public Address(int addressId, String addressTypeCd, int addressStatusTypeCd, int addressStatusReasonCd) {
		super();
		this.addressId = addressId;
		this.addressTypeCd = addressTypeCd;
		this.addressStatusTypeCd = addressStatusTypeCd;
		this.addressStatusReasonCd = addressStatusReasonCd;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressTypeCd=" + addressTypeCd + ", addressStatusTypeCd="
				+ addressStatusTypeCd + ", addressStatusReasonCd=" + addressStatusReasonCd + "]";
	}

	public Address() {}
	

}
