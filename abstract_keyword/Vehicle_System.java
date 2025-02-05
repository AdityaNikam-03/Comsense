package com.tbc.abstract_keyword;
import com.tbc.abstract_keyword.Input;

abstract class Vehicle{
	private String name;
	private int speed;
	
	abstract void accelerate();
	
	void showDetails() {
		System.out.println("Brand : "+name);
		System.out.println("Speed : "+speed);
	}
	
	void setBrand(String name) {
		this.name=name;
	}
	
	void setSpeed(int speed) {
		this.speed+=speed;
	}
}

class Car extends Vehicle{
	
	Car(){
		System.out.print("Enter Name of Car : ");
		this.setBrand(Input.sc.nextLine());
		this.setSpeed(0);
	}
	
	void accelerate(){
		this.setSpeed(20);
	}
}

class Bike extends Vehicle{
	
	Bike(){
		System.out.print("Enter Name of Bike : ");
		this.setBrand(Input.sc.nextLine());
		this.setSpeed(0);
	}
	
	void accelerate(){
		this.setSpeed(10);
	}
}

public class Vehicle_System {

	public static void main(String[] args) {
		Vehicle v=new Car();
		v.showDetails();
		v.accelerate();
		v.accelerate();
		v.showDetails();
		v=new Bike();
		v.showDetails();
		v.accelerate();
		v.accelerate();
		v.showDetails();
	}
}
