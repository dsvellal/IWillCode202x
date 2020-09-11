package com.iWillCode.bank;

import java.util.Date;

public class AccountDetails {
	//User entered variables
	static long baseAcctNo = 100000001;
	private long adhaarCard;
	private String name;
	private String address;
	private String dob;
	private long mobileNo;
	private String referenceName;
	
	//Autoset variables
	private long bankAcctNo;
	private String type; //saving, current, loan, trading
	private String ifscCode;
	private String branchCode;
	private String bankCode;
	private double acctBalance =0;
	
	public AccountDetails(long adhaarCard, String name, String address, String dob, long mobileNo, String referenceName) {
		this.adhaarCard = adhaarCard;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.referenceName = referenceName;
		
		this.bankAcctNo = getAcctNo();
		this.type = "Savings";
		this.ifscCode = "IFSC098765";
		this.branchCode = "CITI-MG01";
		this.bankCode = "CITI-BLR01";
	}
	
	private long getAcctNo() {
		baseAcctNo = baseAcctNo +1;
		return baseAcctNo;
	}
	
	public long getBankAcctNo() {
		return this.bankAcctNo;
	}
	
	public void setAcctBalance(double amtToBeAdded) {
		if (amtToBeAdded > 0) {
			//this.acctBalance = this.acctBalance + amtToBeAdded;
			this.acctBalance = amtToBeAdded;
			System.out.println("Account Balance is set to : "+this.acctBalance);
		}
		else
			System.out.println("The amount to be added to the Balance is incorrect");
	}
	
	public double getAcctBalance() {
		return this.acctBalance;
	}
	
	public void printAcctDetails()
	{
		System.out.println("\n Bank Account Details ");
		System.out.println("=====================");
		System.out.println("Adhaar Card no : "+adhaarCard);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Date of Birth : "+dob);
		System.out.println("Mobile No : "+mobileNo);
		System.out.println("Bank Account No :"+bankAcctNo);
		System.out.println("Account Type :"+type);
		System.out.println("IFSC Code :"+ifscCode);
		System.out.println("Branch Code :"+branchCode);
		System.out.println("Bank Code :"+bankCode);
		System.out.println("Account Balance :"+acctBalance);
			
	}
		
}
