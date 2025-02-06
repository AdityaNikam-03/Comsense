package com.tbc.logic_codes;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter a string buffer: ");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());

        if (str.equals(stringBuffer.toString())) {
            System.out.println("The String and StringBuffer are equal.");
        } else {
            System.out.println("The String and StringBuffer are not equal.");
        }

        scanner.close();
	}

}
