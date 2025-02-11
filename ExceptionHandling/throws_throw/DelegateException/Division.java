package com.tbc.ExceptionHandling.throws_throw.DelegateException;
import java.util.InputMismatchException;

import com.tbc.Input.Scan;

public class Division {
	
	void div() throws ArithmeticException,InputMismatchException{
		System.out.print("Enter Num1 : ");
		int a=Scan.sc.nextInt();
		System.out.print("Enter Num2 : ");
		int b=Scan.sc.nextInt();
		
		System.out.println("Division is : "+(a/b));
	}
}
