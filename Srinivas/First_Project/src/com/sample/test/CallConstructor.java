package com.sample.test;

public class CallConstructor {
	
	public static void main(String [] args)
	{
		ConstructorsAndMethodsExample instance1 = new ConstructorsAndMethodsExample();
		ConstructorsAndMethodsExample instance2 = new ConstructorsAndMethodsExample("srini", 40, "xyz");
		System.out.println(instance1.getName());
		
	
	}

}
