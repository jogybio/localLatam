package com.latam.arq.clilatam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.latam.arq.clilatam.entity.PartyAddresHistory;

@Service("partyAddressHistoryService")
public class PartyAddressHistoryService {

		@Autowired
	    @Qualifier("partyAddressHistoryRepository")
		PartyAddressHistoryRepository PartyAddressHistoryDao;
		
		
		
		public List<PartyAddresHistory> findAddressClient(int partyId) {
			return null ; // PartyAddressHistoryDao.findAddressClient(partyId);
		}



		public List<PartyAddresHistory> findAddress(int partyId) {			
			return  PartyAddressHistoryDao.findAddressClient(partyId);
		}
	
	
}
