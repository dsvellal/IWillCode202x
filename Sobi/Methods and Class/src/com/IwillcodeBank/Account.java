package com.IwillcodeBank;

import java.util.Date;

public class Account {
	static long baseAccountNumber = 1000000000l;
private long aahaarcard;
private String nameofaccholder;
private String dob;
private String address;
private long mobilenumber;
private String referername;

// some of these are autoset by bank.

private long bankaccountno;
private String type; //savings or current or trading or overdraft or loan
private String ifsccode;
private String branchcode;
private String bankcode;
private double accountBalance;


public Account (long aadhaarcard, String nameofaccholder, String dob, String address, long mobilenumber, String referername)
{
	this.aahaarcard = aadhaarcard;
	this.nameofaccholder = nameofaccholder;
	this.dob = dob;
	this.mobilenumber = mobilenumber;
	this.referername = referername;
	
	// Assigning system generated property values
	
	this.bankaccountno = getAccountNumber();
	this.type = "Savings";
	this.ifsccode = "HDFC00001750";
	this.branchcode = "1750";
	this.bankcode = "HDFC0000";
	this.accountBalance = 0d;
		}

		public long getAccountNumber() {
			baseAccountNumber = baseAccountNumber + 1;
			return baseAccountNumber;
		}

		public long getAccountNumber1() {
			return this.getAccountNumber();
		}

		public double getAccountBalance() {
			return this.accountBalance;
		}
	}	


