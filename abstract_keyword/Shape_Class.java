package com.tbc.abstract_keyword;
import com.tbc.abstract_keyword.Input;

abstract class Shape{
	abstract void area();
}

class Rectangle extends Shape{
	void area() {
		System.out.print("Enter Length : ");
		int l=Input.sc.nextInt();
		System.out.print("Enter Breadth : ");
		int b=Input.sc.nextInt();
		System.out.println("Area of Rectangle : "+(l*b));
	}
}

class Circle extends Shape{
	void area() {
		System.out.print("Enter Radius : ");
		int r=Input.sc.nextInt();
		System.out.println("Area of Rectangle : "+(3.1417*r*r));
	}

}

class Square extends Shape{
	void area() {
		System.out.print("Enter Side : ");
		int s=Input.sc.nextInt();
		System.out.println("Area of Rectangle : "+(s*s));
	}

}

public class Shape_Class {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.area();
		s=new Circle();
		s.area();
		s=new Square();
		s.area();
	}

}
