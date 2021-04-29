package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		SavingsAccount test = new SavingsAccount(200.00);
		System.out.println(test.getInterestRate());
		CheckingAccount test2 = new CheckingAccount(200.00);
		System.out.println(test2.getInterestRate());
	}
} 
