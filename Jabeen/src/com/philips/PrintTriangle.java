package com.philips;
import java.util.*;

public class PrintTriangle {
	
	
	public void printRightAngledTriangle(int length) {
		int i = 1;
	    while (i <= length) { // Controls the length
	      int j = 1;
	      while (j <= i) { // Controls what happens at every level of the length
	        System.out.print("1 ");
	        j = j + 1;
	      }
	      System.out.println();
	      i = i + 1;
	    }
	}
	
	public void printInvertedTriangle(int length) {
		int i = 1;
	    while (i <= length) { // Controls the length
	      int j = i;
	      while (j <= length) { // Controls what happens at every level of the length
	        System.out.print("1 ");
	        j = j + 1;
	      }
	      System.out.println();
	      i = i + 1;
	    }		
	}
	
	public void printPyramid(int length) {
		int i = length;
		while (i >= 1) {
			int j = 1;
			while (j <= i) {
				System.out.print(" ");
				j++;
			}
			j=i;
			while (j <= length) {
			  System.out.print("1 ");
			  j++;
			}
			i--;
			System.out.print("\n");
			
		}
	}
	

	public static void main(final String[] args) {
	    // Given the length of the triangle, print a right angle triangle made of 1's, using while loop.
	    // eg: Length = 4
	    // 1
	    // 1 1
	    // 1 1 1
	    // 1 1 1 1
	    System.out.println("What should be the length (in integer): ");
	    final Scanner scn = new Scanner(System.in);
	    final int length = scn.nextInt();
	    
	    System.out.println("\nRight Angled Triangle ");
	    PrintTriangle pt = new PrintTriangle();
		pt.printRightAngledTriangle(length);
		
		System.out.println("\nInverted Triangle ");
		pt.printInvertedTriangle(length);
		
		System.out.println("\nPyramid ");
		pt.printPyramid(length);
	  }
	
	
}
