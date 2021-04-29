package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {

	private final static double INTEREST_RATE = 0.0001;
	
	public CheckingAccount(double openingBalance) {
		super(openingBalance, INTEREST_RATE);
	}
}
