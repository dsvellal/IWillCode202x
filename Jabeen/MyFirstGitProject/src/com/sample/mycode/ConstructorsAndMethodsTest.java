package com.sample.mycode;

public class ConstructorsAndMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorsAndMethods myObj = new ConstructorsAndMethods();
		printDetails(myObj);
		
		ConstructorsAndMethods myNewObj = new ConstructorsAndMethods("Mary",35,"Doctor",76548392);
		printDetails(myNewObj);
	}
	
	public static void printDetails(ConstructorsAndMethods myObj) {
		System.out.println("Name = "+myObj.getName());
		System.out.println("Age = "+ myObj.getAge());
		System.out.println("Designation = "+myObj.getDesignation());
		System.out.println("Security No = "+myObj.getSecurityNo());
		System.out.println("---------------------------------------");
	}	

}
