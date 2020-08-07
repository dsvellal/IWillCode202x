package com.sample.my_code;

public class Method07082020 {

	private String name;

		//Syntax for creating a method
		//access-modifier, <optional-static,final,abstract>, return-data-type, method-name, <optional-method-arguments>
		public String fetchName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public static void main(String[] args) {
			Method07082020 instance = new Method07082020();
			instance.setName("Abhi");
			System.out.println(instance.fetchName());
		}
	}
