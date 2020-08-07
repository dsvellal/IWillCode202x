package com.sample.test;

public class MethodExample {
	
	String name;
	
	public void setName(String name)
	{
		this.name = name;
		
		
	}
	public String getName()
	{
		return this.name;
	}
	
	public static void main(String [] args)
	{
		MethodExample e = new MethodExample();
		e.setName("Srini");
		System.out.println(e.getName());
	}

}
