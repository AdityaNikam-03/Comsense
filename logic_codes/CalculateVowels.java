package com.tbc.logic_codes;

import java.util.Scanner;

public class CalculateVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        input = input.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
        
        sc.close();
	}

}
