package com.tbc.multithreading.Example1;

public class Main {

	public static void main(String[] args) {
		Th1 t=new Th1();
		t.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Go");
	}

}
