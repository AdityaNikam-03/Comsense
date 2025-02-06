package com.tbc.logic_codes;

import java.util.Scanner;

public class CheckSubstring {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.println("Enter the substring to search: ");
        String substring = scanner.nextLine();
        
        if (mainString.contains(substring)) {
            System.out.println("The substring exists in the main string.");
        } else {
            System.out.println("The substring does not exist in the main string.");
        }
        
        scanner.close();
    }
}
