package com.latam.arq.clilatam.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Request implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 8339782058727769236L;

		@Pattern(regexp = "(?:[0-9]{7,13}[0-9kK]{1}|)*$", message = "{memberNumber.pattern.message}")
		@Size(min =0 , max =13 , message = "{memberNumber.size.message}")	
		private String ffNumber;

		private String identificationCd;
	
}
