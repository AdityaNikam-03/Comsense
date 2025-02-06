package com.tbc.logic_codes;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        
	        int length = input.length();
	        System.out.println("The length of the string is: " + length);
	}

}
