package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
    	
    	CDOffering[] CDOfferings = new CDOffering[5];
    	
    	CDOfferings[0] = new CDOffering(1,1.8/100);
    	CDOfferings[1] = new CDOffering(2,1.9/100);
    	CDOfferings[2] = new CDOffering(3,2.0/100);
    	CDOfferings[3] = new CDOffering(5,2.5/100);
    	CDOfferings[4] = new CDOffering(10,2.2/100);
    	
    	MeritBank.setCDOfferings(CDOfferings);
    	
    	AccountHolder ah1 = new AccountHolder("Megan", "", "Emacio", "ssn");
    	
    	ah1.addCheckingAccount(1000);   	
    	ah1.addSavingsAccount(10000);

    	ah1.addCheckingAccount(5000);
    	ah1.addSavingsAccount(50000);
    	
    	ah1.addCheckingAccount(50000);
    	ah1.addSavingsAccount(133000); //changed amount to ensure next step fails, error in instructions
    	
    	CheckingAccount cAcc = ah1.addCheckingAccount(5000);
    	SavingsAccount sAcc = ah1.addSavingsAccount(50000);

    	if (cAcc == null) {
    		System.out.println("Checking account 4 not added");
    	}
    	if (sAcc == null) {
    		System.out.println("Savings account 4 not added");
    	}
    	
    	ah1.addCDAccount(MeritBank.getBestCDOffering(5000), 5000);
    	
    	MeritBank.addAccountHolder(ah1);
    	
    	AccountHolder ah2 = new AccountHolder("John", "", "Doe", "ssn");
    	
    	ah2.addCheckingAccount(1000);   	
    	ah2.addSavingsAccount(10000);
    	
    	ah2.addCDAccount(MeritBank.getSecondBestCDOffering(5000), 5000);
    	
    	MeritBank.addAccountHolder(ah2);
    	
    	MeritBank.clearCDOfferings();
    	
    	AccountHolder ah3 = new AccountHolder("Firsty", "McMiddle", "Lastnameski", "ssn");

    	ah3.addCDAccount(MeritBank.getSecondBestCDOffering(5000), 5000);
    	
    	System.out.println("ah3 number of cd accounts: "+ah3.getNumberOfCDAccounts());
    	
    	ah3.addCheckingAccount(1000);   	
    	ah3.addSavingsAccount(10000);
    	
    	MeritBank.addAccountHolder(ah3);
    	
    	System.out.println("MeritBank total value: "+MeritBank.totalBalances());
    	
    	
	}
} 
