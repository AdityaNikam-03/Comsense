package com.tbc.foodorderingsystem;

public class Pizza implements Food{
	String name;
	int price;
	int quantity;
	Pizza(int Quantity){
		name="Pizza";
		price=300;
		this.quantity=Quantity;
	}
	public int billing() {
		System.out.println("Pizza : "+price);
		return price;
	}
}
