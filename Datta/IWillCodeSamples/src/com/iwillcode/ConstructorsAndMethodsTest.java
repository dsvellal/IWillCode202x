package com.iwillcode;

public class ConstructorsAndMethodsTest {

	public static void main(String[] args) {
		ConstructorsAndMethods datta = new ConstructorsAndMethods();
		printValuesOf(datta);
		
		ConstructorsAndMethods mahesh = new ConstructorsAndMethods("Mahesh", 15, "Engineer");
		printValuesOf(mahesh);
		
		ConstructorsAndMethods kala = new ConstructorsAndMethods(18, "Kala", "PIC-B");
		printValuesOf(kala);
	}
	
	private static void printValuesOf(ConstructorsAndMethods obj) {
		System.out.println("Age: " + obj.getAge());
		System.out.println("Name: " + obj.getName());
		System.out.println("Designation: " + obj.getDesignation());
		System.out.println("Address: " + obj.getAddress());
		System.out.println("-------------------");
	}
}
