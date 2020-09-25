package com.iwillcode.bank;

public class CreditTest {

	public static void main(String[] args) throws Exception {
		AccountDetails fromAccount = new AccountDetails();
		AccountDetails toAccount = new AccountDetails();
		
		fromAccount.setAccountBalance(1000d);
		checkIfAccountDetailsAreCorrect(1000d, fromAccount);
		
		toAccount.setAccountBalance(1000d);
		checkIfAccountDetailsAreCorrect(1000d, toAccount);
		
		printAccountBalance(fromAccount, toAccount);
		
		Credit creditClassInstance = new Credit();
		creditClassInstance.credit(fromAccount, toAccount, 100d);
		checkIfAccountDetailsAreCorrect(900d, fromAccount);
		checkIfAccountDetailsAreCorrect(1100d, toAccount);
		printAccountBalance(fromAccount, toAccount);
		
		creditClassInstance.credit(fromAccount, toAccount, 1000d);
		printAccountBalance(fromAccount, toAccount);
		checkIfAccountDetailsAreCorrect(900d, fromAccount);
		checkIfAccountDetailsAreCorrect(1100d, toAccount);
	}
	
	private static void checkIfAccountDetailsAreCorrect(double expectedAccountBalance, AccountDetails account) {
		if (expectedAccountBalance == account.getAccountBalance()) {
			System.out.println("Transaction was successful");
		} else {
			System.out.println("Transaction failed! Please take a look!");
		}
	}

	private static void printAccountBalance(AccountDetails fromAccount, AccountDetails toAccount) {
		System.out.println("From Account Balance: " + fromAccount.getAccountBalance());
		System.out.println("To Account Balance: " + toAccount.getAccountBalance());
	}

}
