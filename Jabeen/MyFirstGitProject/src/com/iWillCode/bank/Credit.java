package com.iWillCode.bank;

public class Credit {
	public void credit(AccountDetails fromAcct, AccountDetails toAcct, double creditAmount) {
		if (fromAcct.getAcctBalance() > creditAmount)
		{
			double balanceAmtInFromAcct = fromAcct.getAcctBalance() - creditAmount;
			fromAcct.setAcctBalance(balanceAmtInFromAcct);
			
			
			double toAcctNewBalance = toAcct.getAcctBalance() + creditAmount;
			toAcct.setAcctBalance(toAcctNewBalance);
			System.out.println("Credit Transaction is successful for Rs: "+creditAmount);
		}
		else 
			System.out.println("Credit Transaction failed for Rs: "+creditAmount);
	}

}
