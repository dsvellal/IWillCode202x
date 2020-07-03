package com.blueheart;
import java.util.Scanner;

public class PrintRightAngle {

	public void PrintTriangle(int triangleLength) {
		int i = 1;
		while(i <= triangleLength) {
			PrintTriangleWidth(i, triangleLength);
			i++;
		}
	}
	
	public void PrintInvertedTriangle(int triangleLength) {
		int i = triangleLength;
		while(i > 0) {
			PrintTriangleWidth(i, triangleLength);
			i--;
		}
	}
	
	public void PrintTriangleWidth(int triangleWidth, int triangleLength) {
		int k = 0;
		while(k < (triangleLength - triangleWidth)) {
			System.out.print(" ");
			k++;
		}
		int j = 0;
		while(j < triangleWidth) {
			System.out.print(triangleLength + " ");
			j++;
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		// Method to Print Right Angle based on the enter number
		PrintRightAngle myRightAngle = new PrintRightAngle();
		
		System.out.println("Kindly Provide The Length of the Right Angle Triangle: ");
		
		final Scanner myObj = new Scanner(System.in);
		final int lenghtOfRightAngle = myObj.nextInt();
		myObj.close();

		myRightAngle.PrintInvertedTriangle(lenghtOfRightAngle);
		System.out.println();
		myRightAngle.PrintTriangle(lenghtOfRightAngle);
	}
}
