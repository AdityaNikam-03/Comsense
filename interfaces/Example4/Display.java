package com.tbc.interfaces.Example4;

public class Display implements Printable,Showable{
	public void print() {
		System.out.println("Print Method..!");
	}
	
	public void show() {
		System.out.println("Show Method..!");
	}
}
