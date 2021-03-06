package com.cognizant.myAccountt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class AccountManager {
	
	protected HashMap<Integer, String > myMap = new HashMap<Integer, String >();
	protected String name;
	protected String myOutput;
	protected int count = 0;

	
	public void addAccount(Account acc) {
		name = acc.getFirstName() + " " +  acc.getLastName();
		myMap.put(acc.getAccountNumber(),name);
		
	}

	public Map<Integer, String > getMyMap() {
		return myMap;
	}
	
	
	public String convert2Json(Map<Integer, String > myMap) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		myOutput = mapper.writeValueAsString(myMap);
		return myOutput;
	}
	
	public int iteratorOfHashMaps(Map<Integer, String > myMap, String nameToCheck) {
		   Iterator it = myMap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getValue());
		        System.out.println(myMap);
//		        Account acc = (Account) pair.getValue();
		        		if(nameToCheck.equals(pair.getValue())) {
		    		count+=1;
		    	}
//		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    
		 return count;

	}
	
	public long myStream(Map<Integer,String> myMap, String nameCheck) {
		return myMap.entrySet().stream().filter(x -> x.getValue().equals(nameCheck)).count();
	}

}
