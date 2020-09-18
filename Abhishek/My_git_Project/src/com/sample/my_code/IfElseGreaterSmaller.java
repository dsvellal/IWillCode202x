package com.sample.my_code;

public class IfElseGreaterSmaller {
	public static void greater(int num1, int num2, int num3, int num4) {
		if ((num1 > num2) && (num1 > num3) && (num1 > num4))
			System.out.println("greatest No is " + num1);
		else if ((num2 > num1) && (num2 > num3) && (num2 > num4))
			System.out.println("greatest No is " + num2);
		else if ((num3 > num1) && (num3 > num2) && (num3 > num4))
			System.out.println("greatest No is " + num3);
		else
			System.out.println("greatest No is " + num4);
	}

	public static void smaller(int num1, int num2, int num3, int num4) {
		if ((num1 < num2) && (num1 < num3) && (num1 < num4))
			System.out.println("smallest No is " + num1);
		else if ((num2 < num1) && (num2 < num3) && (num2 < num4))
			System.out.println("smallest No is " + num2);
		else if ((num3 < num1) && (num3 < num2) && (num3 < num4))
			System.out.println("smallest No is " + num3);
		else
			System.out.println("smallest No is " + num4);
	}

	public static void main(final String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int num4 = 400;
		greater(num1, num2, num3, num4);
		smaller(num1, num2, num3, num4);
	}
}
