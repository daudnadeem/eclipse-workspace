package com.cognizant.myAccountt;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.cognizant.business.service.AccountServiceImpl;
import com.cognizant.persistence.domain.Account;

public class AccountTest {
	
	

	@Test
	public void AccountTester() {
		Account acc1 = new Account("Slim", "Shady", 1007);
		Account acc2 = new Account("Alvin", "Check", 2000);
		Account acc3 = new Account("Boom", "Baam", 9000);
		Account acc4 = new Account("Slim", "Shady", 1231);
		Account acc5 = new Account("Slim", "Shady", 12312312);
		
		AccountServiceImpl am = new AccountServiceImpl();
		am.addAccount(acc1);
		am.addAccount(acc2);
		am.addAccount(acc3);
		am.addAccount(acc4);
		am.addAccount(acc5);
		
		Map<Integer,String > myMapOutput = am.getMyMap();
		int count = am.iteratorOfHashMaps(myMapOutput, "Slim Shady");
		Assert.assertEquals(3, count);


	}
	
	@Test
	public void AccountStreamTester() {
		Account acc1 = new Account("Slim", "Shady", 1007);
		Account acc2 = new Account("Alvin", "Check", 2000);
		Account acc3 = new Account("Boom", "Baam", 9000);
		Account acc4 = new Account("Slim", "Shady", 1231);
		Account acc5 = new Account("Slim", "Shady", 12312312);
		
		AccountServiceImpl am = new AccountServiceImpl();
		am.addAccount(acc1);
		am.addAccount(acc2);
		am.addAccount(acc3);
		am.addAccount(acc4);
		am.addAccount(acc5);
		
		Map<Integer,String > myMapOutput = am.getMyMap();
		long count = am.myStream(myMapOutput, "Slim Shady");
		Assert.assertEquals(3, count);
	}
}