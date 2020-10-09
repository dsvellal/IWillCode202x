package com.Iwillcode.bank;



public class AccountDetails {
	//User entered properties follow
	private long vAadhaarCard ;
	private String vName ;
	private String vDoB ;
	private String vAddress ;
	private long vMobileNumber ;
	private String vReferer ;
	private long vAcNumasofNow ; //This variable is meant to store the last bank account number
	
	// Properties set by bank follow
	private long vBankAcNumber ;
	private String vAcctType ;
	private String vIFSCCode ;
	private String vBranchCode ;
	private String vBankCode ;
	private double vBankBalance ;
	
	public AccountDetails (long vAadhaarCard, String vName, String vDoB, String vAddress, long vMobileNumber, String vReferer) {
		//Assigning values to user entered properties
		this.vAadhaarCard = vAadhaarCard ;
		this.vName = vName ;
		this.vDoB = vDoB ;
		this.vAddress = vAddress ;
		this.vMobileNumber = vMobileNumber ;
		this.vReferer = vReferer ;
		
		//Assigning values to system generated properties
		this.vBankAcNumber = vAcNumasofNow + 1 ;
		this.vAcctType = "Savings" ;
		this.vIFSCCode = "BANK12345" ;
		this.vBankCode = "Somebank123" ;
		this.vBranchCode = "Manyata560045" ;
		
	} //This is for constructor
	
	public long getBankAccountNumber() {
		return this.vBankAcNumber;
	}

	public double getAccountBalance() {
		return this.vBankBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.vBankBalance = accountBalance;
	}
	

} //This is for class AccountDetails
