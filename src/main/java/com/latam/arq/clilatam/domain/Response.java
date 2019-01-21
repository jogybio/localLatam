package com.latam.arq.clilatam.domain;

import java.util.List;

import lombok.Data;

@Data
public class Response {
	
	private int statusCode;
	private List<Client> listClient;
    private String message;	

}
