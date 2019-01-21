package com.latam.arq.clilatam.domain;

import lombok.Data;

@Data
public class Client {
	
	private int partyId;
	private String ffNumber;
	private String city;
	
	
	@Override
	public String toString() {
		return "Client [partyId=" + partyId + ", ffNumber=" + ffNumber + ", city=" + city + "]";
	}
	
	

}
