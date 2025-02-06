package com.tbc.logic_codes;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; 
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to insert:");
        int element = sc.nextInt();
        System.out.println("Enter the position (0-based index) to insert:");
        int position = sc.nextInt();
        
        if (position < 0 || position > n) {
            System.out.println("Invalid position! Must be between 0 and " + n);
        } else {
            
            for (int i = n; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            
            arr[position] = element;
            
            System.out.println("Array after insertion:");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
