package com.tbc.ExceptionHandling.DivideByZero;
import com.tbc.Input.Scan;

public class Test {

	public static void main(String[] args) {
		System.out.print("Enter First Number : ");
		int a=Scan.sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=Scan.sc.nextInt();
		try {
			int c=a/b;
			System.out.println("Division of Numbers : "+c);
		}catch(ArithmeticException e) {
			System.out.println("Cannot Divide by Zero..!");
		}
	}

}
