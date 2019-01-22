package com.latam.arq.clilatam.domain;

import java.util.List;

import lombok.Data;

@Data
public class Client {
	
	private int partyId;
	private String ffNumber;
	private String name;
	private String lastName;
	private List<InformationClient> information;
	private String city;
	
	
	@Override
	public String toString() {
		return "Client [partyId=" + partyId + ", ffNumber=" + ffNumber + ", name=" + name + ", lastName=" + lastName
				+ ", information=" + information + ", city=" + city + "]";
	}
	

	
	

}
