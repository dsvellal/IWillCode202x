package com.sample.my_code;

public class Forloop_Triangle {

	public static void main(String[] args) {
		// Equilateral triangle

	    final int total_depth = 5;
	    for (int currentDepth = 0; currentDepth < total_depth; currentDepth++) {
	      for (int spaces = currentDepth; spaces < (total_depth - 1); spaces++) { // print inverted r-a-t
	        System.out.print(" ");
	      }
	      for (int ones = 0; ones <= currentDepth; ones++) { // print 1's
	        System.out.print("1 ");
	      }
	      System.out.println();
	    }
	  }

	}
