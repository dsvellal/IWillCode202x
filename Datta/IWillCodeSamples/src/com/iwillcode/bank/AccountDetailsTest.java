package com.iwillcode.bank;

public class AccountDetailsTest {

	public static void main(String[] args) {
		AccountDetails dattasAccount = new AccountDetails();
		if (dattasAccount.getAccountBalance() == 0.0d) {
			System.out.println("Account balance of datta is correct!");
		} else {
			System.out.println("Account balance of datta does not match the expected account balance");
		}
				
		AccountDetails srinisAccount = new AccountDetails();
		if (srinisAccount.getAccountBalance() == 0.0d) {
			System.out.println("Account balance of srini is correct!");
		} else {
			System.out.println("Account balance of srini does not match the expected account balance");
		}
	}
}
