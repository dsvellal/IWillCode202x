package com.sample.my_code;

import java.util.Scanner;

public class July24 {
 
	  public static void main(String[] args) {

	    final Scanner scanner = new Scanner(System.in);	 

	    System.out.println("Please enter a number: ");
try{
	    final int number = scanner.nextInt();	 

	    System.out.println("Entered number is: " + number);

	  } catch (Exception e) {
		  System.out.println("Sorry, you Enter something that is not a integer!");
		  System.out.println("Please rerun the program again, and enter an integer");
	  }

	}
}