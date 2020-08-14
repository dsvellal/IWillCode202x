package com.Methods_In_Class;

public class ConstructorAndMethodsTest {
	public static void main(String[] args) {
		ConstructorAndMethods Vendor = new ConstructorAndMethods();
		printValuesOf(Vendor);
		
		ConstructorAndMethods Vendor1 = new ConstructorAndMethods("Mahesh", "Mahesh_Blore", 150);
		printValuesOf(Vendor1);
	}
	
	private static void printValuesOf(ConstructorAndMethods obj) {
		System.out.println(obj.getVendorName());
		System.out.println(obj.getVendorAddress());
		System.out.println(obj.getVendorID());
		System.out.println("___________________________");
	}

}
