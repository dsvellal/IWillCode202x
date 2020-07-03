package com.philips.vehicle.sample;
/**
 * 
 */

/**
 * @author 310225932
 *
 */
public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car = new Car("CR1234", "Jabeen", 2018, "Red", "Mercedes", "Petrol Car");
		car.displayProperties();
		
		System.out.println("============================");
		System.out.println(" ");
		
		Vehicle bike = new TwoWheeler("TW123", "Mark", 1234, "Black", "Yamaha", "Sports Bike");
		bike.displayProperties();
		
	}

}
