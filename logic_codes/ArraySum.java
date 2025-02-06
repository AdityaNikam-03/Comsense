package com.tbc.logic_codes;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		int[] arr=new int[30];
		System.out.println("Enter the number of elements in array");
		n=sc.nextInt();
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Array you have Entered");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sum of Array is :"+sum);
	}

}
