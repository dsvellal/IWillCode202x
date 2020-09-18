package com.philips.vehicle.sample;

public class TwoWheeler extends Vehicle {

	String brand;
	String Type;
	
	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	
	}
	
	public TwoWheeler (String regno, String name, int model, String clr, String br, String typ) {
		super.setAllVehicleProperties(regno, name, model, clr);
		brand = br;
		Type = typ;
	}
	
	public void displayTwoWheelerProperties() {
		super.displayProperties(brand, Type);
	}
	

}
