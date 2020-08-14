package com.sample.test;

public class ConstructorsAndMethodsExample 

{
	
	private String name;
	private int age;
	private String designation;
	
	public ConstructorsAndMethodsExample()
	{
		this.name = "srini";
		this.age = 15;
		this.designation = "xyz";
	}
	
	public ConstructorsAndMethodsExample(String name, int age, String designation)
	{
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	
	public String getName()
	{
		System.out.println(this.name);
		return this.name;
		
		
	}
	public int getAge()
	{
		return this.age;
		
	}
	public String getDesignation()
	{
		return this.designation;
	}


}
