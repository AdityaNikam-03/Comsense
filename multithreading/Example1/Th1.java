package com.tbc.multithreading.Example1;

public class Th1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
