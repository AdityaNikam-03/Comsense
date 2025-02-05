package com.tbc.Inheritance;

class Demo{
	int a,b;
	Demo(){
		System.out.println("Default Constructor...!");
	}
	
	Demo(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Base class Constructor called Using super...!");
	}
	
	void display() {
		System.out.println("a : "+a+","+"b : "+b);
	}
}

class Test extends Demo{
	int c,d;
	Test(int a,int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
		System.out.println("Child Class Constructor...!");
	}
	
	void display() {
		super.display();
		System.out.println("c : "+c+","+"d : "+d);
	}
}



public class Super_Keyword {

	public static void main(String[] args) {
		Test t=new Test(10,20,30,40);
		t.display();

	}

}
