package com.tbc.foodorderingsystem;

public class Cold_Drinks implements Food{
	String itName="Cold Drinks";
	int price=100;
	public int billing() {
		System.out.println("Cold Drinks : "+price);
		return price;
	}
}
