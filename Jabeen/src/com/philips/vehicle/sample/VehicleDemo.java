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
		
		Car car = new Car("CR1234", "Jabeen", 2018, "Red", "Mercedes", "Petrol Car");
		System.out.println("My Vehicle is a four Wheeler ");
		car.displayProperties("Mercedes", "Petrol Car");
		
		System.out.println("============================");
		System.out.println(" ");
		
		TwoWheeler bike = new TwoWheeler("TW123", "Mark", 1234, "Black", "Yamaha", "Sports Bike");
		System.out.println("My Vehicle is a two Wheeler ");
		bike.displayProperties("Yamaha", "Sports Bike");
	}

}
