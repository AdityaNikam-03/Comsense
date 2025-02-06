package com.tbc.logic_codes;

import java.util.Scanner;

public class DuplicateChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("Duplicate values in the String:");

        boolean hasDuplicates = false; 

        for (int i = 0; i <str.length()-1; i++) {
            for (int j = i + 1; j <str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j)) { 
                    System.out.print(str.charAt(i) + " ");
                    hasDuplicates = true;
                    break; 
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate values found.");
        }


	}

}
