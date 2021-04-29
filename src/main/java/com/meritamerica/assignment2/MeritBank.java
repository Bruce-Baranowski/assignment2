package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	private static AccountHolder[] accounts = new AccountHolder[0];
	private static CDOffering[] cdOfferings = new CDOffering[0];
	private static long nextAccountNumber = 1;
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] tmp = new AccountHolder[accounts.length+1];
		for (int i = 0; i<accounts.length; i++) {
			tmp[i] = accounts[i];
		}
		tmp[accounts.length] = accountHolder;
		accounts = tmp;
	}
	
	public static AccountHolder[] getAccounts() {
		return accounts;
	}
	
	public static CDOffering[] getCdOfferings() {
		return cdOfferings;
	}
	
	public static void setCdOfferings(CDOffering[] cdOfferings) {
		MeritBank.cdOfferings = cdOfferings;
	}
	
	public static void clearCdOfferings() {
		MeritBank.cdOfferings = new CDOffering[0];
	}
	
	public static long getNextAccountNumber() {
		return nextAccountNumber++;
	}

	double futureValue(double presentValue, double interestRate, int term) {
		return presentValue * Math.pow(1 + interestRate, term);
	}
}
