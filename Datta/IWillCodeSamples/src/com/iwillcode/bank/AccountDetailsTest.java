package com.iwillcode.bank;

public class AccountDetailsTest {

	public static void main(String[] args) {
		AccountDetails dattasAccount = new AccountDetails(100000000000l, "Datta", "12/06/1985", "Girinagar", 1234567890, "Kiran");
		if (dattasAccount.getAccountBalance() == 0.0d) {
			System.out.println("Account balance of datta is correct!");
		} else {
			System.out.println("Account balance of datta does not match the expected account balance");
		}
				
		AccountDetails srinisAccount = new AccountDetails(100000000001l, "Srini", "13/12/1985", "Bangalore", 1234567891, "Kiran");
		if (srinisAccount.getAccountBalance() == 0.0d) {
			System.out.println("Account balance of srini is correct!");
		} else {
			System.out.println("Account balance of srini does not match the expected account balance");
		}
	}
}
