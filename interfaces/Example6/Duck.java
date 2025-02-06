package com.tbc.interfaces.Example6;

public class Duck implements Flyable,Swimmable{
	
	public void fly() {
		System.out.println("Duck Can fly...!");
	}
	
	public void swim() {
		System.out.println("Duck can Swim");
	}
}
