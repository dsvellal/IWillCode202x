package com.iwillcode.bank;

public class AccountDetailsTests {
	public static void main(String[] args) {
		AccountDetails datta = new AccountDetails("Datta");
		datta.credit(10.0);
		datta.printAccountBalance();
		System.out.println("----------");

		datta.debit(5.0);
		datta.printAccountBalance();
		System.out.println("----------");
		
		datta.credit(-1.0);
		datta.printAccountBalance();
		System.out.println("----------");
		
		datta.debit(10.0);
		datta.printAccountBalance();
		System.out.println("----------");
	}
}
