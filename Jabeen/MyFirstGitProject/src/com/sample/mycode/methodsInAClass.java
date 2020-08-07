package com.sample.mycode;

public class methodsInAClass {

	private String name;
	
	public String fetchName() {
		return this.name;
	}
	
	public void setName(String ipname) {
		name = ipname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsInAClass obj = new methodsInAClass();
		obj.setName("Jabeen");
		System.out.println("Print Name \n"+obj.fetchName());
	}

}
