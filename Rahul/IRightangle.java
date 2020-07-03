package com.RK;
import java.util.*;
public class IRightangle 			
			{

		public static void main(String[] args) 
		{
			int Number;
			System.out.println("number of rows:");
		    Scanner input=new Scanner(System.in);
			Number=input.nextInt();
			input.close();
			for(int i=Number; i > 0;i--)
			{ 
				for(int j=0; j< i;j++)
				{
					System.out.print("1");
				}
				System.out.println("");
			}

		}
	}
