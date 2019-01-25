package com.latam.arq.clilatam.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.latam.arq.clilatam.domain.Request;
import com.latam.arq.clilatam.domain.Response;
import com.latam.arq.clilatam.service.IClientService;



@RestController
public class ListClientApi {

	static final Logger logger = LoggerFactory.getLogger(ListClientApi.class);
	
	@Autowired
	@Qualifier("clientServiceImpl")
	private IClientService clientService;
	
	
	@RequestMapping(value = "/ws/api/client/v3/listClient", method = RequestMethod.GET)
	public Response getClientCustomer(@RequestBody @Valid Request request, Errors errors) {
		Response response = new Response();
		
		logger.info("  REQUEST: "+ request.toString() );
			response.setListClient(clientService.obtainClientProcess(request));	
	

		return response;
		
	}
}
