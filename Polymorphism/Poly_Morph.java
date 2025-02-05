package com.tbc.Polymorphism;

class Parent{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	void area() {
		System.out.print("Enter Radius : ");
		int r=sc.nextInt();
		double area=(3.14*r*r);
		System.out.println("Area of Circle : "+area);
		System.out.println();
	}
	
	void sum() {
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number :");
		int b=sc.nextInt();
		System.out.println("Sum of Numbers : "+(a+b));
	}
}

class Child extends Parent{
	void division() {
	
	}
	
	void area() {
		System.out.print("Enter Length : ");
		int l=sc.nextInt();
		System.out.print("Enter Breadth : ");
		int b=sc.nextInt();
		System.out.println("Area of Rectangle : "+l*b);
		System.out.println();
	}
}

public class Poly_Morph {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.area();
		p.sum();
		p=new Child();
		p.area();
		//p.division();  //this line gives error--->div() method not defined in Parent class
	}
}
