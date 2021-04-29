package com.meritamerica.assignment2;

import java.util.Arrays;


public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount[] checkAccounts;
	private SavingsAccount[] saveAccounts;
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

	public CheckingAccount[] getCheckingAccounts() {
		return checkAccounts;
	}

	public SavingsAccount[] getSavingsAccounts() {
		return saveAccounts;
	}

	@Override
	public String toString() {
		return "\nName: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + "\nSSN: "
				+ this.getSSN() + this.getCheckingAccounts().toString() + this.getSavingsAccounts().toString();
	}
}