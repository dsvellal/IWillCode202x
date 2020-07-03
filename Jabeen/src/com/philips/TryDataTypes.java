package com.philips;
import java.util.Date;

public class TryDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intnum = 10;
		float floatnum = 2.34f;
		long longnum = 234567;
		
		char charvar = 'b';
		String word = "Hello";
		
		String[] vegList = {"potato", "Onion", "Carrot", "Beans"};
		int[] daysinaweek = new int[] {1,2,3,4,5,6,7};
		char[] hellostring = {'h','e','l', 'l','o'};
		
		Date today = new Date();	
				
		System.out.println(intnum);
		System.out.println(floatnum);
		System.out.println(longnum);
		System.out.println(charvar);
		System.out.println(word);
		for (int i=0; i<vegList.length; i++)
		{
		    System.out.println(vegList[i]);
		    System.out.println(daysinaweek[i]);
		}
		//System.out.println(daysinaweek[0]);
		System.out.println(hellostring);
		System.out.println(today);
		System.out.println("");
	
		// Find Average
		int sum = 20;
		int tot = 4;
		double avg = sum/tot;
		System.out.println("Average ="+avg);
		
		// Print Full Name
		String firstName = "Mark";
		String lastName = "Twain";
		String fullName = firstName+" "+lastName;
		System.out.println(fullName);
		
		}
	}
