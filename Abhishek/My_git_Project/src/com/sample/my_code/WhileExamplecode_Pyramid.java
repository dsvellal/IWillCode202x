package com.sample.my_code;
import java.util.Scanner;
public class WhileExamplecode_Pyramid {

	public static void main(String[] args) {
		// Given the length of the triangle, print a pyramid made of 1's, using while loop.
	    // eg: Length = 4
	    //    1
	    //   1 1
	    //  1 1 1
	    // 1 1 1 1

	    System.out.println("What should be the length of the Pyramid (in integer): ");
	    final Scanner scn = new Scanner(System.in);
	    final int length = scn.nextInt();
	    int i = 1;
	    while (i <= length) { // Controls the length
	      int j = 1;
	      while (j <= i) { // Controls what happens at every level of the length

	    	System.out.print("1 ");
	        j = j + 1;
	      }
	      System.out.println();
	    	int k =1 ;
	    	  while (k < length) {
	    	  k = k + 1;
	    	  System.out.print(" ");
	    	  }
	      i = i + 1;
	    }  
	    scn.close();
}

	}
