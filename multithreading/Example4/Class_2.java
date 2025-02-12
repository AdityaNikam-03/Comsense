package com.tbc.multithreading.Example4;

public class Class_2 extends Class_1 implements Runnable{ 
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Threading Using Runnable");
		}
	}
}
