package com.tbc.multithreading.Example3;

public class Th2 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread-2");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
