package com.blueheart;

public class FindHighestAndLowestNumber {

	public static void main(String[] args) {
		// The purpose of program is to find the highest and lowest number in the provided number list
		int num1 = -400;
		int num2 = -300;
		int num3 = -100;
		int num4 = 200;
		int tempHighestNum01 = 0;
		int tempLowestNum01 = 0;
		int tempHighestNum02 = 0;
		int tempLowestNum02 = 0;
		int highestNum = 0;
		int lowestNum = 0;
		
		if(num1 > num2) {
			tempHighestNum01 = num1;
			tempLowestNum01 = num2;
		}
		else {
			tempHighestNum01 = num2;
			tempLowestNum01 = num1;
		}
		
		if(num3 > num4) {
			tempHighestNum02 = num3;
			tempLowestNum02 = num4;
		}
		else {
			tempHighestNum02 = num4;
			tempLowestNum02 = num3;
		}		

		if(tempHighestNum01 > tempHighestNum02) {
			highestNum = tempHighestNum01;
		}
		else {
			highestNum = tempHighestNum02;
		}

		if(tempLowestNum01 > tempLowestNum02) {
			lowestNum = tempLowestNum02;
		}
		else {
			lowestNum = tempLowestNum01;
		}		
		
		System.out.println("Highest Number Is: " + highestNum);
		System.out.println("Lowest Number Is: " + lowestNum);
	}

}
