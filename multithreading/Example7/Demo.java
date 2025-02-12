package com.tbc.multithreading.Example7;

public class Demo extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Current Executing Thread : "+Thread.currentThread().getName()+"-"+i);
		}
	}

	public static void main(String[] args) throws InterruptedException{
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		d1.start();
		d1.join();
		d2.start();
		d2.join();
	}

}
