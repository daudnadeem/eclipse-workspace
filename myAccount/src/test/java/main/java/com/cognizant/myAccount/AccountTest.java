package main.java.com.cognizant.myAccount;

public class AccountTest {
	
	Account acc1 = new Account("Slim", "Shady", 1007);
	Account acc2 = new Account("Alvin", "Check", 2000);
	Account acc3 = new Account("Boom", "Baam", 9000);
	Account acc4 = new Account("Slim", "Shady", 9000);

	@Test
	public void AccountTester() {
		AccountManager am = new AccountManager();
		am.addAccount(acc1);
		am.addAccount(acc2);
		am.addAccount(acc3);
		am.addAccount(acc4);
		
		Map<String, Integer> myMapOutput = am.getMyMap();
		int count = am.iteratorOfHashMaps(myMap, "Slim Shady");
		Assert.assertEquals(2, count);

		System.out.println(am.convert2Json(myMapOutput));

}