package com.iwillcode.bank;

public class AccountDetails {
	static long baseAccountNumber = 1000000000l;
	// Some of these are user entered properties
	private long aadhaarCard;
	private String nameOfAccountHolder;
	private String dob;
	private String address;
	private long mobileNumber;
	private String refererName;
	private double accountBalance;
	
	// Some of these are autoset by the bank
	private long bankAccountNumber;
	private String type; // Savings or current or trading or overdraft or loan
	private String ifscCode;
	private String branchCode;
	private String bankCode;
	
	public AccountDetails(long aadhaarCard, String nameOfAccountHolder, String dob, String address, long mobileNumber, String refererName) {
		// Assigning values to user entered properties
		this.aadhaarCard = aadhaarCard;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.dob = dob;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.refererName = refererName;
		
		// Assigning system generated property values
		this.bankAccountNumber = getAccountNumber();
		this.type = "Savings";
		this.ifscCode = "HDFC00001750";
		this.branchCode = "1750";
		this.bankCode = "HDFC0000";
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
}
