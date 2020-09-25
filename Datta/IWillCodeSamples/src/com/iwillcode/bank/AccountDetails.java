package com.iwillcode.bank;

public class AccountDetails {
	static long baseAccountNumber = 1000000000l;
	// Some of these are user entered properties
	private double accountBalance;
	
	// Some of these are autoset by the bank
	private long bankAccountNumber;

	
	public AccountDetails() {
		this.bankAccountNumber = getAccountNumber();
		this.accountBalance = 0d;
	}

	private long getAccountNumber() {
		baseAccountNumber = baseAccountNumber + 1;
		return baseAccountNumber;
	}

	public long getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
