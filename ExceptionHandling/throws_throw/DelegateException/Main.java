package com.tbc.ExceptionHandling.throws_throw.DelegateException;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Division d=new Division();
		
		try {
			d.div();
		}catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero....!");
		}catch(InputMismatchException e) {
			System.out.println("Enter only Integers..!");
		}

	}

}
