package com.tbc.logic_codes;

import java.util.Scanner;

public class SecondLargest {

	public static int findSecondLargest(int[] arr) {
        int largest = arr[0], secondLargest = -1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
	}

}
