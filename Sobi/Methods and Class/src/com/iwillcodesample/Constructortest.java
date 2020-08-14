package com.iwillcodesample;

public class Constructortest {

	public static void main(String[] args) {
		Constructors Nagercoil = new Constructors();
		printValuesOf(Nagercoil);

		Constructors Bangalore = new Constructors("Bangalore", 350, "flight");
		printValuesOf(Bangalore);
	}

	private static void printValuesOf(Constructors obj) {
		System.out.println(obj.getplace());
		System.out.println(obj.getdistance());
		System.out.println(obj.gettransport());
	}
}