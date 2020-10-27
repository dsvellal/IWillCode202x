package com.sample.test;


class Calculation
{
	int z;
	public void addition(int x, int y)
	{
		System.out.println(x);
		z = x+y;
		System.out.println(z);
	}
	public void subtraction(int x, int y)
	{
		z = x-y;
		System.out.println(z);
	}
}
public class InheritExample extends Calculation
{
	public static void man(String [] args)
	{
		int a =2, b=3;
		InheritExample t = new InheritExample();
		t.addition(2, 3);
	}
	
	
	
	

}
