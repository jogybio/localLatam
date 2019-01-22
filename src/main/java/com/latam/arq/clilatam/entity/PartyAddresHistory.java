package com.latam.arq.clilatam.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PARTY_ADDRESS_HISTORY")
public class PartyAddresHistory {
	
		@Id
		@Column(name = "PARTY_ID")
		private int partyID;
		
		@Column(name = "ADDRESS_ID")
		private int addressId;
		
		@Column(name = "ADDRESS_USAGE_CD")
		private int addressUsageCd;
		
		@Column(name = "PARTY_ADDRESS_START_DTTM")
		private Date partyAddressStartDttm;
		
		@Column(name = "PARTY_ADDRESS_END_DTTM")
		private Date PartyAddressEndDttm;

		public int getPartyID() {
			return partyID;
		}

		public void setPartyID(int partyID) {
			this.partyID = partyID;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public int getAddressUsageCd() {
			return addressUsageCd;
		}

		public void setAddressUsageCd(int addressUsageCd) {
			this.addressUsageCd = addressUsageCd;
		}

		public Date getPartyAddressStartDttm() {
			return partyAddressStartDttm;
		}

		public void setPartyAddressStartDttm(Date partyAddressStartDttm) {
			this.partyAddressStartDttm = partyAddressStartDttm;
		}

		public Date getPartyAddressEndDttm() {
			return PartyAddressEndDttm;
		}

		public void setPartyAddressEndDttm(Date partyAddressEndDttm) {
			PartyAddressEndDttm = partyAddressEndDttm;
		}

		@Override
		public String toString() {
			return "PartyAddresHistory [partyID=" + partyID + ", addressId=" + addressId + ", addressUsageCd="
					+ addressUsageCd + ", partyAddressStartDttm=" + partyAddressStartDttm + ", PartyAddressEndDttm="
					+ PartyAddressEndDttm + "]";
		}

		public PartyAddresHistory(int partyID, int addressId, int addressUsageCd, Date partyAddressStartDttm,
				Date partyAddressEndDttm) {
			super();
			this.partyID = partyID;
			this.addressId = addressId;
			this.addressUsageCd = addressUsageCd;
			this.partyAddressStartDttm = partyAddressStartDttm;
			PartyAddressEndDttm = partyAddressEndDttm;
		}
		
		public PartyAddresHistory() {}

}
