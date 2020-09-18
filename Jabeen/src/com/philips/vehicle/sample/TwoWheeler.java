package com.philips.vehicle.sample;

public class TwoWheeler extends Vehicle {

	String brand;
	String Type;
	
	Vehicle newv = new Vehicle();
	
	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	
	}
	
	public TwoWheeler (String regno, String name, int model, String clr, String br, String typ) {
		super.setRegNo(regno);
		super.setOwner(name);
		super.setModel(model);
		super.color = clr;
		
		newv.setRegNo(regno);
		brand = br;
		Type = typ;
	}
	
	public void displayTwoWheelerProperties() {
		super.displayProperties(brand, Type);
	}
	

}
