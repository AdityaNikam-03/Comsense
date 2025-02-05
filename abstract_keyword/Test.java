package com.tbc.abstract_keyword;


abstract class Parent{
	abstract void job();
	void education() {
		System.out.println("Education");
	}
}

class Child extends Parent{
	
	void job() {
		System.out.println("Comsense");
	}
}

public class Test {

	public static void main(String[] args) {
		Parent p=new Child();
		p.education();
		p.job();
	}

}
