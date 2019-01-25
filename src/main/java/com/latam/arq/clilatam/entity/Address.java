package com.latam.arq.clilatam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ADDRESS")
public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4379611113614366602L;

	@Id
	@Column(name = "ADDRESS_ID")
	private Integer addressId;
	
	@Column(name = "ADDRESS_TYPE_CD")
	private Integer addressTypeCd;
	
	@Column(name = "ADDRESS_STATUS_TYPE_CD")
	private String addressStatusTypeCd;
	
	@Column(name = "ADDRESS_STATUS_REASON_CD")
	private Integer addressStatusReasonCd;


	
	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getAddressTypeCd() {
		return addressTypeCd;
	}

	public void setAddressTypeCd(Integer addressTypeCd) {
		this.addressTypeCd = addressTypeCd;
	}

	public String getAddressStatusTypeCd() {
		return addressStatusTypeCd;
	}

	public void setAddressStatusTypeCd(String addressStatusTypeCd) {
		this.addressStatusTypeCd = addressStatusTypeCd;
	}

	public Integer getAddressStatusReasonCd() {
		return addressStatusReasonCd;
	}

	public void setAddressStatusReasonCd(Integer addressStatusReasonCd) {
		this.addressStatusReasonCd = addressStatusReasonCd;
	}


	public Address() {}
	

}
