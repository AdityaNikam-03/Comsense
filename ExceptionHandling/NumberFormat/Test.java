package com.tbc.ExceptionHandling.NumberFormat;

public class Test {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt("String");
		}catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
	}

}
