package com.sample.test;

public class ObjectForAbstractClass 
{
	String name;
	int rollno;
	
	//the main purpose of constructor is to initialize object. first object will be created using new operator and then initialization will be performed by construcutor. 
	
	ObjectForAbstractClass(String name, int rollno)
	{
		this.name = name;
		this.rollno= rollno;
		
	}
	
	public static void main(String [] args)
	{
		ObjectForAbstractClass s = new ObjectForAbstractClass("srini", 10);
		
		System.out.println(s.name + s.rollno);
	}

}
