package com.iWillCode.bank;

import java.util.Scanner;

public class CreditTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails fromAcct = new AccountDetails (12345678901234L, "Jabeen", "RT Nagar Bangalore", "08-04-1990", 9886821518L,"Sonu");
		AccountDetails toAcct = new AccountDetails (1234567891, "Reena", "Hebbal Bangalore", "08-07-1990", 988767523,"Jabeen");
		
		boolean status = acctInitialBalance(fromAcct, toAcct, 15000d, 10000d);
		printAccountBalance(fromAcct, toAcct);
		
		Scanner scan = new Scanner(System.in);
				
		do {
			System.out.println("Enter the Amount to Credit : ");
			double amtToCredit = scan.nextDouble();
			performTransaction(fromAcct,toAcct,amtToCredit);
			System.out.println("Do yo need to make another Credit Transaction ? ");
			String input = scan.next();
			if ("Yes".equalsIgnoreCase(input))
				status = true;
			else
				status = false;
			/*double[] moneyToCredit = {1000d,100d,700d};
			for (double creditMoney: moneyToCredit) {
				performTransaction(fromAcct,toAcct,creditMoney);
			}*/
			
			}while (status == true);
			System.out.println("Transaction is complete. Thank You !");
					
	}
	private static boolean acctInitialBalance (AccountDetails fromAcct, AccountDetails toAcct, double fromAcctBalance, double toAcctBalance)
	{
		fromAcct.setAcctBalance(fromAcctBalance);
		toAcct.setAcctBalance(toAcctBalance);
		if((fromAcctBalance == fromAcct.getAcctBalance()) && (toAcctBalance == toAcct.getAcctBalance()))
		{
			System.out.println("Initial Balance Transaction is successful ");
			return true;
		}
		else
		{
			System.out.println("Initial Balance Transactions failed!! ");
			return false;
		}
	}
		
	private static void performTransaction (AccountDetails fromAcct, AccountDetails toAcct, double amtToBeTrans)
	{
		Credit creditInst = new Credit();
		creditInst.credit(fromAcct, toAcct, amtToBeTrans);
		printAccountBalance(fromAcct, toAcct);
			
	}
		
	private static void printAccountBalance(AccountDetails fromAccount, AccountDetails toAccount) {
			System.out.println("Account Balance Details " );
			System.out.println("======================= " );
			System.out.println("From Account Balance: " + fromAccount.getAcctBalance());
			System.out.println("To Account Balance: " + toAccount.getAcctBalance());
			System.out.println();
	}
}


