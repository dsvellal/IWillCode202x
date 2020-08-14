package com.Methods_In_Class;

public class ConstructorAndMethods {
	private String VendorName;
	private String VendorAddress;
	private int VendorID;
	
	//Default stuff - constructor
	//has access modifier, name - nameOfTheClass (COmplulsory), arguments - optional
	public ConstructorAndMethods() {
		VendorName = "ABCD";
		VendorAddress = "XYZ";
		VendorID = 100;	
	}
	
	//non - default constructor
	public ConstructorAndMethods(String VendName, String VendAdd, int VendID) {
		VendorName = VendName;
		VendorAddress = VendAdd;
		VendorID = VendID;
	}
	
	public String getVendorName() {
		return this.VendorName;
	}
	public String getVendorAddress() {
		return this.VendorAddress;
	}
	public int getVendorID() {
		return this.VendorID;
	}

}
