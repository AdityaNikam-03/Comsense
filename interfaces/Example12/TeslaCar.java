package com.tbc.interfaces.Example12;

public class TeslaCar extends Vehicle implements SelfDriving,ElectricVehicle{
	public void navigate() {
		System.out.println("navigate method called...");
	}
	
	public void chargeBattery() {
		System.out.println("chargeBattery method called...");
	}
}
