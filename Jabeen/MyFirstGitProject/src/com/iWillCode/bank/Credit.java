package com.iWillCode.bank;

public class Credit {
	public void credit(AccountDetails fromAcct, AccountDetails toAcct, double creditAmount) {
		if (fromAcct.getAcctBalance() > creditAmount)
		{
			double balanceAmtInFromAcct = fromAcct.getAcctBalance() - creditAmount;
			System.out.println("Balance amt in From Acct = "+ balanceAmtInFromAcct);
			fromAcct.setAcctBalance(balanceAmtInFromAcct);
			
			
			double toAcctNewBalance = toAcct.getAcctBalance() + creditAmount;
			System.out.println("Balance amt in To Acct = "+ toAcctNewBalance);
			toAcct.setAcctBalance(toAcctNewBalance);
		}
		else 
			System.out.println(" Credit Transaction failed");
	}

}
