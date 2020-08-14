package com.sample.mycode;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba = new BankAccount("M Jabeen");
		printAcctDetails(ba);
		
		ba.credit(1000.00);
		printAcctDetails(ba);
		
		ba.debit(600.00);
		printAcctDetails(ba);
		
		ba.credit(-200.00);
		ba.debit(-300.00);
		
	} 
    public static void printAcctDetails(BankAccount bObj)
    {
    	System.out.println ("Bank Account Details");
    	System.out.println("----------------------");
    	System.out.println("Name : "+bObj.getName());
    	System.out.println("Account Number : "+bObj.getAcctNo());
    	System.out.println("Account Balance : "+bObj.getAcctBalance());
    	System.out.println("----------------------------");
    }
}

