package com.tbc.logic_codes;

import java.util.Scanner;

public class EqualString {

    public static boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();
        
        if (areStringsEqual(str1, str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
	}

}
