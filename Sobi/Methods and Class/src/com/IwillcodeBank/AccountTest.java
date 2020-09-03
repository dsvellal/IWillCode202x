package com.IwillcodeBank;

public class AccountTest {

	public static void main(String[] args) {
		Account sobisAccount = new Account(100000000000l, "Sobi", "10/04/1992", "Kandanvilai", 1234567890, "KK");
		System.out.println("Sobi's account number = " + sobisAccount.getAccountNumber());

		Account devsAccount = new Account(100000000001l, "Dev", "13/12/1965", "Chennai", 1234567891, "KK");
		System.out.println("Dev's account number = " + devsAccount.getAccountNumber());
	}
}