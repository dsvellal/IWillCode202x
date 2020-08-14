package com.sample.mycode;

public class ConstructorsAndMethods {
	private String name;
	private int age;
	private String designation;
	private long securityNo;

	public ConstructorsAndMethods() {
		// TODO Auto-generated constructor stub
		name= "Samira";
		age = 30;
		designation = "Architect";
		securityNo = 123456789;
	}
	
	public ConstructorsAndMethods(String myname, int myage, String mydesig, long mySecNo) {
		// TODO Auto-generated constructor stub
		name= myname;
		age = myage;
		designation = mydesig;
		securityNo = mySecNo;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{ 
		return this.age;
	}
	
	public String getDesignation ()
	{
		return this.designation;
		
	}
	
	public long getSecurityNo ()
	{
		return this.securityNo;
		
	}
}
