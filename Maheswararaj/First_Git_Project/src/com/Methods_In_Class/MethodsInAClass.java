package com.Methods_In_Class;

public class MethodsInAClass {
	private String name;
	private String name_1;
	
	//Syntax for creating a method
	//access-modifier, <optional - static, final, abstract>, return-data-type, <Optional-method-arguments>
	public String fetchname() {
	return this.name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		MethodsInAClass instance = new MethodsInAClass();
		instance.setname("Mahesh");
		System.out.println(instance.fetchname());
		
		MethodsInAClass instance_1 = new MethodsInAClass();
		instance_1.setname("Maheswararaj J");
		System.out.println(instance_1.fetchname());
	}
	
}
	
