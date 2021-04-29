package com.meritamerica.assignment2;

import java.util.Arrays;


public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount[] checkAccounts = new CheckingAccount[0];
	private SavingsAccount[] saveAccounts = new SavingsAccount[0];
	private CDAccount[] cdAccounts = new CDAccount[0];
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount[] tmp = new CheckingAccount[checkAccounts.length+1];
		for (int i = 0; i<checkAccounts.length; i++) {
			tmp[i] = checkAccounts[i];
		}
		CheckingAccount newAccount = new CheckingAccount(openingBalance);
		tmp[checkAccounts.length] = newAccount;
		checkAccounts = tmp;
		return newAccount;
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		CheckingAccount[] tmp = new CheckingAccount[checkAccounts.length+1];
		for (int i = 0; i<checkAccounts.length; i++) {
			tmp[i] = checkAccounts[i];
		}
		tmp[checkAccounts.length] = checkingAccount;
		checkAccounts = tmp;
		return checkingAccount;
	}

	public CheckingAccount[] getCheckingAccounts() {
		return checkAccounts;
	}

	public int getNumberOfCheckingAccounts() {
		return checkAccounts.length;
	}

	public double getCheckingBalance() {
		double tmpTotal = 0;
		for (CheckingAccount x: checkAccounts) {
			tmpTotal+=x.getBalance();
		}
		return tmpTotal;
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount[] tmp = new SavingsAccount[saveAccounts.length+1];
		for (int i = 0; i<saveAccounts.length; i++) {
			tmp[i] = saveAccounts[i];
		}
		SavingsAccount newAccount = new SavingsAccount(openingBalance);
		tmp[saveAccounts.length] = newAccount;
		saveAccounts = tmp;
		return newAccount;
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		SavingsAccount[] tmp = new SavingsAccount[saveAccounts.length+1];
		for (int i = 0; i<saveAccounts.length; i++) {
			tmp[i] = saveAccounts[i];
		}
		tmp[saveAccounts.length] = savingsAccount;
		saveAccounts = tmp;
		return savingsAccount;
	}

	public SavingsAccount[] getSavingsAccounts() {
		return saveAccounts;
	}

	public int getNumberOfSavingsAccounts() {
		return saveAccounts.length;
	}

	public double getSavingsBalance() {
		double tmpTotal = 0;
		for (SavingsAccount x: saveAccounts) {
			tmpTotal+=x.getBalance();
		}
		return tmpTotal;
	}
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount[] tmp = new CDAccount[cdAccounts.length+1];
		for (int i = 0; i<cdAccounts.length; i++) {
			tmp[i] = cdAccounts[i];
		}
		CDAccount newAccount = new CDAccount(offering, openingBalance);
		tmp[cdAccounts.length] = newAccount;
		cdAccounts = tmp;
		return newAccount;
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount[] tmp = new CDAccount[cdAccounts.length+1];
		for (int i = 0; i<cdAccounts.length; i++) {
			tmp[i] = cdAccounts[i];
		}
		tmp[cdAccounts.length] = cdAccount;
		cdAccounts = tmp;
		return cdAccount;
	}

	public CDAccount[] getCDAccounts() {
		return cdAccounts;
	}

	public int getNumberOfCDAccounts() {
		return cdAccounts.length;
	}

	public double getCDBalance() {
		double tmpTotal = 0;
		for (CDAccount x: cdAccounts) {
			tmpTotal+=x.getBalance();
		}
		return tmpTotal;
	}
	
	public double getCombinedBalance() {
		double tmpTotal = 0;
		tmpTotal += this.getCheckingBalance();
		tmpTotal += this.getSavingsBalance();
		tmpTotal += this.getCDBalance();
		return tmpTotal;
	}

	@Override
	public String toString() {
		return "\nName: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + "\nSSN: "
				+ this.getSSN() + this.getCheckingAccounts().toString() + this.getSavingsAccounts().toString();
	}
}