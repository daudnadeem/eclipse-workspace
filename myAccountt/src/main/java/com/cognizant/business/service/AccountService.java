package com.cognizant.business.service;

import java.util.Map;

import com.cognizant.persistence.domain.Account;

public interface AccountService {
	
	Map<Integer, String> getMyMap();

	String addAccount(String account);

	String convert2Json(Map<Integer, String> myMap);

	int iteratorOfHashMaps(Map<Integer, String> myMap, String nameToCheck);
	
	long myStream(Map<Integer,String> myMap, String nameCheck);

	String getAllAccounts();
	
	String getAnAccount(long id);
	
	String deleteAccount(Long id);

}
