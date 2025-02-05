package com.tbc.interfaces.Example1;

public class Bike implements Vehicle{
	public void start() {
		System.out.println("Kick Start...!");
	}
	
	public void stop() {
		System.out.println("Disc Break..!");
	}
	
	public void fuelType() {
		System.out.println("Uses Petrol");
	}
}
