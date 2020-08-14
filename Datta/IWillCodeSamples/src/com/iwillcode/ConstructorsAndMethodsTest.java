package com.iwillcode;

public class ConstructorsAndMethodsTest {

	public static void main(String[] args) {
		ConstructorsAndMethods datta = new ConstructorsAndMethods();
		printValuesOf(datta);
		
		ConstructorsAndMethods mahesh = new ConstructorsAndMethods("Mahesh", 15, "Engineer");
		printValuesOf(mahesh);
	}
	
	private static void printValuesOf(ConstructorsAndMethods obj) {
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getDesignation());
	}
}
