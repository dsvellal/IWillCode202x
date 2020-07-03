package com.philips;
import java.util.Scanner;

public class FindMaxMinNumber 
{
    public static void main(String[] args) 
    {
        int CountofNumber, MaxNumber,MinNumber;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        CountofNumber = s.nextInt();
        int a[] = new int[CountofNumber];
        System.out.println("Enter elements of array:\n");
        for(int i = 0; i < CountofNumber; i++)
        {
            a[i] = s.nextInt();
        }
        MaxNumber = a[0];
        MinNumber = a[0];
        for(int i = 0; i < CountofNumber; i++)
        {
            if(MaxNumber < a[i])
            {
            	MaxNumber = a[i];
            }
            if(MinNumber > a[i])
            {
            	MinNumber = a[i];
            }
        }
        System.out.println( MaxNumber+" IS THE LARGEST NUMBER ");
        System.out.println( MinNumber+" IS THE Smallest NUMBER ");
    }
}