package com.philips;
import java.util.*;

public class largeSmallNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[] {-63,-57,-1,-25};
		int large=0;
		int small=0;
		
	/*					
		for (int i =0; i < num.length(); i++)
		{
				
			if (i==0 )
			{
				small = num[i];
				large = num[i];
			}
			
			if (num[i] > large)
				large = num[i];
			else
			if (num[i] < small)
				small = num[i];
			
		} */
			
		//System.out.println("Largest Number = "+large);
		//System.out.println("Smallest Number = "+small);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want ");
		
		int total1 = scan.nextInt();
		int num1[] = new int[10];
		
		System.out.println("Enter the numbers ");
		for (int i =0; i<total1; i++)
		{
			num1[i] = scan.nextInt();
		
		}
		
		for (int i =0; i < total1; i++)
		{
				
			if (i==0 )
			{
				small = num1[i];
				large = num1[i];
			}
			
			if (num1[i] > large)
				large = num1[i];
			else
			if (num1[i] < small)
				small = num1[i];
			
		}
		System.out.println("Largest Number = "+large);
		System.out.println("Smallest Number = "+small);
		
	}

}
