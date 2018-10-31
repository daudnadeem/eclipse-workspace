package main.java.com.cognizant.myAccount;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) throws JsonProcessingException {


		Account acc1 = new Account("Slim", "Shady", 1007);
		Account acc2 = new Account("Alvin", "Check", 2000);
		Account acc3 = new Account("Boom", "Baam", 9000);
		Account acc4 = new Account("Boom", "Baam", 9000);
		Account acc5 = new Account("Boom", "Baam", 9000);
		
		AccountManager am = new AccountManager();
		am.addAccount(acc1);
		am.addAccount(acc2);
		am.addAccount(acc3);
		am.addAccount(acc4);
		am.addAccount(acc5);
		
		Map<String, Integer> myMapOutput = am.getMyMap();
		

		System.out.println(am.convert2Json(myMapOutput));
		
		System.out.println(am.iteratorOfHashMaps(am.getMyMap(),"Boom Baam"));

	}

}
