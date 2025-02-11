package com.tbc.foodorderingsystem;

public class Berger implements Food{
	String itName="Berger";
	int price=200;
	public int billing() {
		System.out.println("Berger : "+price);
		return price;
	}
}
