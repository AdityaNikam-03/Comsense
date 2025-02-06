package com.tbc.logic_codes;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Dynamically set array size

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to remove:");
        int search = sc.nextInt();
        
        int index = -1; // Default index value for not found
        
        // Finding the index of the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                index = i;
                break; // Stop once found
            }
        }

        if (index != -1) {
            // Shift elements to the left
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("New array after removal:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Element not present...");
        }
        
        sc.close(); // Closing the scanner
    }
}
