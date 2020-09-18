package com.philips;

import java.util.Scanner;


public class WhileAndDoWhile {
		
	public void rightAngledTriangle(int length) {
		int i = 1;
		do {
	     int j = i;
	      while (j <= i) { // Controls what happens at every level of the length
	        System.out.print("1 ");
	        j = j + 1;
	      }
	      System.out.println();
	      i = i + 1;
	    } while (i <= length);
	}
	
	public void invertedTriangle(int length) {
		int i = 1;
		do {
	     int j = i;
	      while (j <= length) { // Controls what happens at every level of the length
	        System.out.print("1 ");
	        j = j + 1;
	      }
	      System.out.println();
	      i = i + 1;
	    } while (i <= length);		
	}
	
	// This logic also works
	/*public void equilateral(int length) {
		int i = length;
		do {
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
			
		}while (i >= 1);
	}
*/
	public void equilateral(int length) {
		for (int depth = 0; depth < length; depth++)
		{
			//for (int spaces = 0; spaces < length -1- depth; spaces ++) // This also works
			for (int spaces = depth; spaces < length-1; spaces++)
			{
			   System.out.print(" ");
			}
			for (int ones =0; ones <= depth; ones++)
			{ 
				System.out.print("1 ");
			}
			System.out.println("");
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print 3 types of triangles (Inverted, Right Angled, Equilateral)
		// Ask the user for which type of triangle is needed and print the same.
		// IDE that gets inputs from command line
		
		int condition = 0;
		int length = 0;
		WhileAndDoWhile printTriangle = new WhileAndDoWhile();
		
		
		do {
		    System.out.println("Which type of triangle would you like to print ? : ");
		    final Scanner sc1 = new Scanner(System.in);
		    String string = null;
		    string = sc1.nextLine();		    	    
		   
		    if (string.equalsIgnoreCase("Inverted") | string.equalsIgnoreCase("Right Angled") | (string.equalsIgnoreCase("Equilateral")) ) {
		    	System.out.println ("What is the depth of the triangle : ");
		    	length = sc1.nextInt();
		    }
		    if (length <=1 )	{
		    	System.out.println(" Please enter valid depth for the triangle to be printed");
		    }
		    else if (string.equalsIgnoreCase("Inverted")) {
		    	printTriangle.invertedTriangle(length);
		    	System.out.println();
		    }
		    else if (string.equalsIgnoreCase("Right Angled")) {
		    	printTriangle.rightAngledTriangle(length);
		    	System.out.println();
		    }
		    else if(string.equalsIgnoreCase("Equilateral")){
		    	printTriangle.equilateral(length);
		    	System.out.println();
		    }
		    else {
		    	System.out.println("This type of triangle cannot be printed !! Pls choose a valid option - Right Angled, Inverted or Equilateral");
		    }
		    
		    System.out.println("Do you need to print another triangle (0/1) : ");
		    condition = sc1.nextInt();
		    if (condition == 0 )
		    	System.out.println("This is the end. Thank You ");
		    System.out.println();
		} while (condition == 1);
				
	}
}
