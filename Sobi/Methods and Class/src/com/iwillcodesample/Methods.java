package com.iwillcodesample;

public class Methods {
	
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
			Methods instance = new Methods();
			instance.setName("Sobi D M");
			System.out.println(instance.fetchName());
		}
	}