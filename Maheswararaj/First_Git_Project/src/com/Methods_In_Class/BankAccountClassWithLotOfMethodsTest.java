package com.Methods_In_Class;

public class BankAccountClassWithLotOfMethodsTest {
	public static void main(String[] args) {
		
		BankAccountClassWithLotOfMethods datta = new BankAccountClassWithLotOfMethods("Datta");
		
		datta.credit(10.0);
		datta.getAccountBalance();
		System.out.println("----------");

		datta.debit(5.0);
		datta.getAccountBalance();
		System.out.println("----------");
		
		datta.credit(-1.0);
		datta.getAccountBalance();
		System.out.println("----------");
		
		datta.debit(10.0);
		datta.getAccountBalance();
		System.out.println("----------");
	}
}
