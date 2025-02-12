package com.tbc.multithreading.Example6;

public class Test extends Thread{
	
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" ");
		}
		System.out.println("Synchronized method executed...!");
	}

	public static void main(String[] args) {
		Test t=new Test();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		
		//synchronized is useful to lock thread on single object in concurrent environment
		//calling same method i.e. run() on the same object t
		t1.start();
		t2.start();
	}

}
