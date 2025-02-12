package com.tbc.multithreading.Example4;

public class Main {

	public static void main(String[] args) {
		Class_2 obj=new Class_2();
		Thread t=new Thread(obj);
		obj.greet();
		t.start();
	}
}
