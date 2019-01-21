package com.latam.arq.clilatam.service;

import java.util.List;

import com.latam.arq.clilatam.domain.Client;
import com.latam.arq.clilatam.domain.Request;

public interface IClientService {
	

	public List<Client> obtainClientProcess(Request request);

}
