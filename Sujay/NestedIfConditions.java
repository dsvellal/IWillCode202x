package com.blueheart;

public class NestedIfConditions {

	public static void main(String[] args) {
		// This class checks if the amount requested could be withdrawn

		int accountMinimumBalance = 2000;
		int balanceInAccount = 4500;
		int amountRequested = 2500;
		
		if(balanceInAccount >= accountMinimumBalance) {
			if((balanceInAccount - amountRequested) < accountMinimumBalance) {
				System.out.println("Chose a different withdraw amount, to maintain the account's minimum balance");
			}
			if((balanceInAccount - amountRequested) >= accountMinimumBalance) {
				System.out.println("You can proceed with withdrawing the amount");
			}
		}
		else {
			System.out.println("You cannot withdraw amount. Check the account's minimum balance");
		}
	}

}