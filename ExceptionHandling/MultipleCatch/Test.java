package com.tbc.ExceptionHandling.MultipleCatch;
import com.tbc.Input.Scan;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.print("Enter Num1 : ");
			int a=Integer.parseInt(Scan.sc.nextLine());
			System.out.print("Enter Num2 : ");
			int b=Integer.parseInt(Scan.sc.nextLine());
			System.out.println("Division : "+(a/b));
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
	}

}
