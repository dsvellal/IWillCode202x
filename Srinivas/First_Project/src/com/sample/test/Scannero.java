package com.sample.test;


import java.util.*;
public class Scannero 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		try {
		int number = scanner.nextInt();
		System.out.println("Enterned number is " +number);}
		catch(Exception e)
		{
			System.out.println("Sorry you had entered, something not integer");
		}
		
		
	}
}
