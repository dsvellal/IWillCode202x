package com.Iwillcode.bank;

import java.util.Date ;

public class AccountDetails {
	//User entered properties follow
	private long vAadhaarCard ;
	private String vName ;
	private Date vDoB ;
	private String vAddress ;
	private long vMobileNumber ;
	private String vReferer ;
	
	// Properties set by bank follow
	private String vBankAcNumber ;
	private String vAcctType ;
	private String vIFSCCode ;
	private String vBranchCode ;
	private String vBankCode ;
	
	public AccountDetails (long vAadhaarCard, String vName, Date vDoB, String vAddress, long vMobileNumber, String vReferer) {
		//Assigning values to user entered properties
		this.vAadhaarCard = vAadhaarCard ;
		this.vName = vName ;
		this.vDoB = vDoB ;
		this.vAddress = vAddress ;
		this.vMobileNumber = vMobileNumber ;
		this.vReferer = vReferer ;
		
		//Assigning values to system generated properties
		// this.vBankAcNumber = mgetAccountNumber();
		this.vAcctType = "Savings" ;
		this.vIFSCCode = "BANK12345" ;
		this.vBankCode = "Somebank123" ;
		this.vBranchCode = "Manyata560045" ;
		
	} //This is for constructor

} //This is for class AccountDetails
