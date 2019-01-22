package com.latam.arq.clilatam.service;

import java.util.List;

import com.latam.arq.clilatam.entity.PartyAddresHistory;

public interface IPartyAddressHistoryService {

	public List<PartyAddresHistory> obtainInfoClientProcess(int partyId);
	
}
