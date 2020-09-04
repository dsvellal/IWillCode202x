package com.sample.test;

public class Credit {
	
	public void credit(AccountDetails fromAccount, AccountDetails toAccount, double amountToBeCredited) {
		// Check if the from account has sufficient balance
		if (fromAccount.getAccountBalance() >= amountToBeCredited) {
			// Debit money from fromAccount
			double balanceAmountInFromAccount = fromAccount.getAccountBalance() - amountToBeCredited;
			fromAccount.setAccountBalance(balanceAmountInFromAccount);
			
			// Credit money into toAccount
			double toAccountNewBalance = toAccount.getAccountBalance() + amountToBeCredited;
			toAccount.setAccountBalance(toAccountNewBalance);
			
		} else {
			System.out.println("Something went wrong!");
		}
	}

}