package com.tbc.logic_codes;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter the string to be replaced: ");
        String oldSubstring = scanner.nextLine();

        System.out.println("Enter the replacement string: ");
        String newSubstring = scanner.nextLine();

        String replacedString = originalString.replace(oldSubstring, newSubstring);

        System.out.println("Updated string: " + replacedString);

        scanner.close();

	}

}
