package com.tbc.multithreading.Example3;

public class Main {

	public static void main(String[] args) {
		Th1 t1=new Th1();
		Th2 t2=new Th2();
		t1.start();
		t2.start();

	}

}
