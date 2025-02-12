package com.tbc.multithreading.Example9;

class Test extends Thread{
	
	public void run() {
		System.out.println("Run method of Thread..!");
	}
}

public class Main {

	public static void main(String[] args) {
		Test t=new Test();
		
		t.start();
		System.out.println(t.isAlive());
		System.out.println(t.getId());
	}


}
