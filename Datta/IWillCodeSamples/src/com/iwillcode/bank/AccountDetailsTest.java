package com.iwillcode.bank;

public class AccountDetailsTest {

	public static void main(String[] args) {
		AccountDetails dattasAccount = new AccountDetails(100000000000l, "Datta", "12/06/1985", "Girinagar", 1234567890, "Kiran");
		System.out.println("Datta's account number = " + dattasAccount.getBankAccountNumber());
				
		AccountDetails srinisAccount = new AccountDetails(100000000001l, "Srini", "13/12/1985", "Bangalore", 1234567891, "Kiran");
		System.out.println("Srini's account number = " + srinisAccount.getBankAccountNumber());
	}
}
