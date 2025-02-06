package com.tbc.interfaces.Example2;
import com.tbc.Input.Scan;

public class Rectangle implements Shape{
	public void calculateArea() {
		System.out.print("Enter Length : ");
		int l=Scan.sc.nextInt();
		System.out.print("Enter Breadth : ");
		int b=Scan.sc.nextInt();
		System.out.println("Area of Reactangle : "+(l*b));
	}
}
