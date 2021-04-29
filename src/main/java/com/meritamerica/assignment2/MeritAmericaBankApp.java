package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		CDOffering oneYear = new CDOffering(1, 1.8/100);
		CDOffering twoYear = new CDOffering(2, 1.9/100);
		CDOffering threeYear = new CDOffering(3, 2.0/100);
		CDOffering fiveYear = new CDOffering(5, 2.5/100);
		CDOffering tenYear = new CDOffering(10, 2.2/100);
		
		AccountHolder testHolder = new AccountHolder("first", "mid", "last", "222222222222");
		
		CheckingAccount tmpaccount = testHolder.addCheckingAccount(100000.0);
		CheckingAccount tmpaccount2 = testHolder.addCheckingAccount(400000.0);

		System.out.println(tmpaccount);
		System.out.println(testHolder.getCheckingAccounts());
		System.out.println(testHolder.getCheckingBalance());
		
	}
} 
