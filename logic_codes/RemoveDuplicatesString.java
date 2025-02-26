package com.tbc.logic_codes;

import java.util.Scanner;

public class RemoveDuplicatesString {
	
	 public static String removeDuplicates(String str) {
	        String result = "";
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (result.indexOf(ch) == -1) {
	                result += ch;
	            }
	        }
	        
	        return result;
	    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
	}

}
