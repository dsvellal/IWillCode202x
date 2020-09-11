package com.iWillCode.bank;

public class CreditTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails fromAcct = new AccountDetails (12345678901234L, "Jabeen", "RT Nagar Bangalore", "08-04-1990", 9886821518L,"Sonu");
		AccountDetails toAcct = new AccountDetails (1234567891, "Reena", "Hebbal Bangalore", "08-07-1990", 988767523,"Jabeen");
		
		fromAcct.setAcctBalance(1500d);
		checkIfAccountDetailsAreCorrect(1500d, fromAcct);
		
		toAcct.setAcctBalance(1500d);
		checkIfAccountDetailsAreCorrect(1500d, toAcct);
		
		Credit creditInst = new Credit();
		creditInst.credit(fromAcct, toAcct, 500d);
		printAccountBalance(fromAcct, toAcct);
		
	}
		
		private static void checkIfAccountDetailsAreCorrect(double expectedAccountBalance, AccountDetails account) {
			if (expectedAccountBalance == account.getAcctBalance()) {
				System.out.println("Transaction was successful. Expected Balance = "+account.getAcctBalance());
			} else {
				System.out.println("Transaction failed! Please take a look!");
			}
		}
		
		private static void printAccountBalance(AccountDetails fromAccount, AccountDetails toAccount) {
			System.out.println("From Account Balance: " + fromAccount.getAcctBalance());
			System.out.println("To Account Balance: " + toAccount.getAcctBalance());
		}
}


