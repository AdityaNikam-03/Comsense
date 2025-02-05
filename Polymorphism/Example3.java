package com.tbc.Polymorphism;
import java.util.Scanner;

class Shape{
	void calculateArea(Scanner sc) {
		System.out.println("Create Object of Below Three Classes...!");
		System.out.println();
	}
}

class Circle extends Shape{
	void calculateArea(Scanner sc) {
		System.out.print("Enter Radius : ");
		double r;
		r=sc.nextDouble();
		System.out.println("Area of Circle : "+(3.1417*r*r));
		System.out.println();
	}
}

class Rectangle extends Shape{
	void calculateArea(Scanner sc) {
		System.out.print("Enter Length : ");
		int l;
		l=sc.nextInt();
		System.out.print("Enter Breadth : ");
		int b;
		b=sc.nextInt();
		System.out.println("Area of Rectangle : "+(l*b));
		System.out.println();
	}
}

class Triangle extends Shape{
	void calculateArea(Scanner sc) {
		System.out.print("Enter Base : ");
		int b;
		b=sc.nextInt();
		System.out.print("Enter Height : ");
		int h;
		h=sc.nextInt();
		System.out.println("Area of Triangle : "+((b*h)/2));
		System.out.println();
	}
}

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape s=new Shape();
		s.calculateArea(sc);
		s=new Circle();
		s.calculateArea(sc);
		s=new Rectangle();
		s.calculateArea(sc);
		s=new Triangle();
		s.calculateArea(sc);
	}

}
