package com.philips;
import java.util.Scanner;
public class PrintRevTriangle
{
public static void main(String[] args)
	    {
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter the number of lines you want in the triangle : "); //takes input from user
	 
	    int RowCount = sc.nextInt();
	 
	    for (int i= RowCount-1; i>=0 ; i--)
	    {
	    	for (int j=0; j<=i; j++)
	    	{
	    		System.out.print("*" + " ");
	    		}
	    	System.out.println();
	    }
	    sc.close();
	    }
 }
	

