package com.tbc.multithreading.Example2;

public class Th2 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread-2");
		}
	}
}
