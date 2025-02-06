package com.tbc.logic_codes;

import java.util.Scanner;

public class DuplicateIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate values in the array:");

        boolean hasDuplicates = false; 

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) { 
                    System.out.print(arr[i] + " ");
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
