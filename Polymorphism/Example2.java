package com.tbc.Polymorphism;

class Vehicle{
	int speed;
	
	Vehicle(){
		this.speed=0;
	}
	
	void speedUp() {
		this.speed+=50;
	}
	
	int getSpeed() {
		return this.speed;
	}
}

class Car extends Vehicle{
	int speed;
	Car(){
		this.speed=0;
	}
	
	void speedUp() {
		this.speed+=30;
	}
	
	int getSpeed() {
		return this.speed;
	}
}


class Bicycle extends Vehicle{
	int speed;
	Bicycle(){
		this.speed=0;
	}
	void speedUp() {
		this.speed+=10;
	}
	
	int getSpeed() {
		return this.speed;
	}
}

public class Example2 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.speedUp();
		System.out.println(v.getSpeed());
		v.speedUp();
		System.out.println(v.getSpeed());
		
		v=new Car();
		v.speedUp();
		System.out.println(v.getSpeed());
		v.speedUp();
		System.out.println(v.getSpeed());
		
		v=new Bicycle();
		v.speedUp();
		System.out.println(v.getSpeed());
		v.speedUp();
		System.out.println(v.getSpeed());
	}

}
