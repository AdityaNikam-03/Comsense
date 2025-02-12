package com.tbc.multithreading.Example5;

public class Main {

	public static void main(String[] args) {
		Demo d=new Demo();
		Test t=new Test();
		d.setName("Demo Thread...!");
		t.setName("Test Thread...!");
		
		d.setPriority(5);
		t.setPriority(10);
		
		d.start();
		t.start();
		
		System.out.println(d.getName());
		System.out.println(t.getName());

	}

}
