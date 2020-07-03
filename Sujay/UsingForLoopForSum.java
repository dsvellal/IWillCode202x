package com.blueheart;

public class UsingForLoopForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] iNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int sumOfNumbers = 0;

		/*for (int i=0; i < iNumbers.length; i++) {
			sumOfNumbers = sumOfNumbers + iNumbers[i];
		}*/
		
		for (Integer iNumber : iNumbers) {
			sumOfNumbers = sumOfNumbers + iNumber;
		}
		
		System.out.println("Sum of Numbers : " + sumOfNumbers);
		/*System.out.print("Sum of Numbers (");
		for (int i=0; i < iNumbers.length; i++) {
			System.out.print(iNumbers[i] + " ");
		}
		System.out.print("): " + sumOfNumbers);*/
	}
}