package com.qa.business.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.qa.persistence.domain.Account;


public class AccountManagerImpl {
	private HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();

	public void addAccount(Account a) {
		accountMap.put(a.getAccountNumber(), a);
	}
	
	
	public Map<Integer, Account> getAccounts() {
		return accountMap;
	}
	
	public void deleteAccount(int accountNum) {
		accountMap.remove(accountNum);
	}
	
	public String mapToJson(Map<Integer, String > myMap) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(myMap);
		 }

	public int countNameOccurences(String name) {
		int count=0;
		Iterator it = this.accountMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Account acc = (Account) pair.getValue();
	        if(name == acc.getfName()) count++;
	        it.remove();
	    }	
	    return count;
	}
	
	public long countNameOccurencesStream(String name) {
		return accountMap.entrySet().stream().filter(n -> n.getValue().getfName()==name).count();
	}
	
		
}
