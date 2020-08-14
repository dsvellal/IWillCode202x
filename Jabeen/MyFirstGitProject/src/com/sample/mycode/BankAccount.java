package com.sample.mycode;

public class BankAccount {

	private long accountNo;
	private String name;
	private double accountBalance;
	
	public BankAccount(String acctName) {
		name = acctName;
		accountBalance = 0;
		accountNo = name.hashCode();
	}
	
	public void credit(double amount) {
		if (amount >0)
		{
		 this.accountBalance = this.accountBalance + amount;
		 System.out.println("\n Credited : "+amount);
		}
		else
			System.out.println("\n Amount for credit is invalid and cannot be credited : "+ amount);
	}

	public void debit(double amount) {
		if (amount < 0)
		{
			System.out.println (" \n Amount for debit is invalid and cannot be debited : "+ amount);
		}
		else
		{
		  this.accountBalance = this.accountBalance - amount;	
		  System.out.println("\n Debited :"+amount);
		}
		
	}
	
	public String getName() {
		return this.name;		
	}
	
	public long getAcctNo() {
		return this.accountNo;
	}
	
	public double getAcctBalance() {
		return this.accountBalance;
	}
}
