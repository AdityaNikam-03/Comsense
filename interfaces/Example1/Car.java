package com.tbc.interfaces.Example1;

public class Car implements Vehicle{
	public void start() {
		System.out.println("Button Start...!");
	}
	
	public void stop() {
		System.out.println("Hand Break..!");
	}
	
	public void fuelType() {
		System.out.println("Uses Diesel");
	}
}
