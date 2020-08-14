package com.iwillcode;

public class ConstructorsAndMethods {
	private String name;
	private int age;
	private String designation;
	private String address;
	
	// Default stuff - constructor
	// has access modifier, name - nameOfTheClass (compulsory), arguments - optional
	public ConstructorsAndMethods() {

	}
	
	// Non-default constructor
	public ConstructorsAndMethods(String myName, int myAge, String myDesignation) {
		name = myName;
		age = myAge;
		designation = myDesignation;
	}
	
	public ConstructorsAndMethods(int myAge, String myName, String myAddress) {
		name = myName;
		age = myAge;
		address = myAddress;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	
	public String getAddress() {
		return address;
	}
}
