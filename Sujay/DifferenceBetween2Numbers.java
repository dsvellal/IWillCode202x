package com.blueheart;

public class DifferenceBetween2Numbers {

	public static void main(String[] args) {
		// Method to find and print the difference between two successive numbers in an array 
		int[] numberList1 = {1, 2, 3, 4, 5};
		int[] numberList2 = {29, -1, 2, 96};
		
		System.out.println("Number List 1");
		for(int i = 0; i < (numberList1.length - 1); i++) {
			int isNumberNegative = 0;
			isNumberNegative = numberList1[(i)] - numberList1[(i+1)];
			if(isNumberNegative < 0) {
				isNumberNegative = isNumberNegative * -1;
			}
			System.out.println("Difference Between (" + numberList1[(i)] + "," + numberList1[(i+1)] + ") : " + isNumberNegative);
		}

		System.out.println("\nNumber List 2");
		for(int i = 0; i < (numberList2.length - 1); i++) {
			int isNumberNegative = 0;
			isNumberNegative = numberList2[(i)] - numberList2[(i+1)];
			if(isNumberNegative < 0) {
				isNumberNegative = isNumberNegative * -1;
			}
			System.out.println("Difference Between (" + numberList2[(i)] + "," + numberList2[(i+1)] + ") : " + isNumberNegative);
		}
	}

}