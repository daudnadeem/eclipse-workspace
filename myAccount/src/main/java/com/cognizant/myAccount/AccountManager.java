package main.java.com.cognizant.myAccount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class AccountManager {
	
	protected HashMap<String, Integer> myMap = new HashMap<String, Integer>();
	protected String name;
	protected String myOutput;
	protected int count = 0;

	
	public void addAccount(Account acc) {
		name = acc.getFirstName() + " " +  acc.getLastName();
		myMap.put(name, acc.getAccountNumber());
		
	}

	public Map<String, Integer> getMyMap() {
		return myMap;
	}
	
	
	public String convert2Json(Map<String, Integer> myMap) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		myOutput = mapper.writeValueAsString(myMap);
		return myOutput;
	}
	
	public int iteratorOfHashMaps(Map<String,Integer> myMap, String nameToCheck) {
		   Iterator it = myMap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey());
		        System.out.println(myMap);
//		        Account acc = (Account) pair.getValue();
		        		if(nameToCheck.equals(pair.getKey())) {
		    		count+=1;
		    	}
//		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    
		 return count;

	}

}
