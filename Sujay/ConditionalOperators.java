package com.blueheart;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int age = 18;
		final int Salary = 50000;
		
		final boolean validAge = (age >= 0);
		
		if(!validAge) {
			System.out.println("Not a valid age");
			System.exit(1);
		}
		else {
			//Do Something
			if((age <= 18) && (Salary <= 10000)) {
				System.out.println("It's ok, you still have time. Work hard");
			}
			else {
				System.out.println("Your age is greater than 18, and/or your salary is greater than 10000");
				if (Salary != 500000) {
					
				}
			}
		}
	}

}
