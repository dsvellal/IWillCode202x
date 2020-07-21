package com.sample.test;

public class AvgOfNumbers 
{
	public static void main(String [] args)
	{
		double [] arr = {19, 12, 0, 18, 17, 20};
		double total = 0;
		
		for (int i=0; i<arr.length; i++)
		{
			total = total + arr[i];
			
			
		}
		double average = total / arr.length;
		
		System.out.println(average);
		
		
		
	}

}
