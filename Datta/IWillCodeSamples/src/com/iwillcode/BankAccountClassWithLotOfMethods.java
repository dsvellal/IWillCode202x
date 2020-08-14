package com.iwillcode;

public class BankAccountClassWithLotOfMethods {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccountClassWithLotOfMethods(String nameOfAccountHolder) {
		accountHolderName = nameOfAccountHolder;
		accountBalance = 0;
		accountNumber = accountHolderName.hashCode();
	}

	public void credit(double valueToBeAdded) {
		if (valueToBeAdded > 0) {
			accountBalance = accountBalance + valueToBeAdded;
		} else {
			System.out.println("Invalid value being credited. Operation cancelled!");
		}
		
	}
	
	public void debit(double valueToBeDebited) {
		if (accountBalance >= valueToBeDebited) {
			accountBalance = accountBalance - valueToBeDebited;
		} else {
			System.out.println("Invalid funds");
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void getAccountBalance() {
		System.out.println(accountBalance);
	}
}
