package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {

	private final static double INTEREST_RATE = 0.01;
	
	public SavingsAccount(double openingBalance) {
		super(openingBalance, INTEREST_RATE);
	}
}
