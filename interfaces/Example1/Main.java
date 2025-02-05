package com.tbc.interfaces.Example1;

public class Main {

	public static void main(String[] args) {
		Vehicle v=new Car();
		v.start();
		v.stop();
		v.fuelType();
		v=new Bike();
		v.start();
		v.stop();
		v.fuelType();
	}

}
