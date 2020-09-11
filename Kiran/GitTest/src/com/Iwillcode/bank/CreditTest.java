package com.Iwillcode.bank;

public class CreditTest {

	public static void main(String[] args) throws Exception {
		AccountDetails fromAccount = new AccountDetails(1L, "Datta", "06/12/1985", "Bangalore", 9L, "Kiran");
		AccountDetails toAccount = new AccountDetails(2L, "Vidhathri", "19/11/1990", "Bangalore", 8L, "Datta");
		boolean IsTrue1 = true;
		boolean IsTrue2 = true;
		
		fromAccount.setAccountBalance(1000d);
		toAccount.setAccountBalance(1000d);

		CheckBalance(fromAccount, toAccount, 1000d, 1000d) ;
		
		printAccountBalance(fromAccount, toAccount);
		
		Credit creditClassInstance = new Credit();
		creditClassInstance.credit(fromAccount, toAccount, 100d);
		
		CheckBalance(fromAccount, toAccount, 900d, 1100d) ;
		
		printAccountBalance(fromAccount, toAccount);
		
		creditClassInstance.credit(fromAccount, toAccount, 1000d);
		printAccountBalance(fromAccount, toAccount);
		CheckBalance(fromAccount, toAccount, 900d, 1000d) ;

	}
	
	private static boolean checkIfAccountDetailsAreCorrect(double expectedAccountBalance, AccountDetails account) {
		if (expectedAccountBalance == account.getAccountBalance()) {
			return true;
			// System.out.println("Transaction was successful for " + account.getBankAccountNumber());
		} else {
			return false;
			// System.out.println("Transaction failed! Please take a look!");
		}
	}

	private static void printAccountBalance(AccountDetails fromAccount, AccountDetails toAccount) {
		System.out.println("From Account Balance: " + fromAccount.getAccountBalance());
		System.out.println("To Account Balance: " + toAccount.getAccountBalance());
	}
	
	private static void CheckStatus (boolean t1, boolean t2) {
		if (t1 && t2)
			System.out.println("Transaction was successful");
		else
			System.out.println("Transaction was unsuccessful");
	}
	
	private static void CheckBalance (AccountDetails fromAD1, AccountDetails toAD2, double BalFrom1, double BalTo2) {
		
		boolean IsTrue1 = checkIfAccountDetailsAreCorrect(BalFrom1, fromAD1);
		boolean IsTrue2 = checkIfAccountDetailsAreCorrect(BalTo2, toAD2);
	
		CheckStatus (IsTrue1, IsTrue2) ;
	}
}