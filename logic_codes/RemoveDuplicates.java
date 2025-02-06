package com.tbc.logic_codes;

import java.util.Scanner;

public class RemoveDuplicates {
	 public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        int[] temp = new int[n];
	        int j = 0;

	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                temp[j++] = arr[i];
	            }
	        }
	        temp[j++] = arr[n - 1];

	        int[] result = new int[j];
	        for (int i = 0; i < j; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }
	 
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        scanner.close();

	        int[] result = removeDuplicates(arr);

	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }
	}
}
