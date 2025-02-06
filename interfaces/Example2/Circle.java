package com.tbc.interfaces.Example2;
import com.tbc.Input.Scan;

public class Circle implements Shape{
	public void calculateArea() {
		System.out.print("Enter Radius of Circle : ");
		double r=Scan.sc.nextDouble();
		System.out.println("Area of Circle : "+(3.1417*r*r));
	}
}
