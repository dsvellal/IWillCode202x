package com.iWillCode.bank;

public class AccountDetailsTest {

	public static void main (String args[] )
	{
		
		AccountDetails acct1 = new AccountDetails (12345678901234L, "Jabeen", "RT Nagar Bangalore", "08-04-1990", 9886821518L,"Sonu");
		acct1.printAcctDetails();
		
		AccountDetails acct2 = new AccountDetails (1234567891, "Reena", "Hebbal Bangalore", "08-07-1990", 988767523,"Jabeen");
		acct2.printAcctDetails();
	}
}
