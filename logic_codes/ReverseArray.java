package com.tbc.logic_codes;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n=sc.nextInt();
		int[] arr=new int[10];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Reversed Array is ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
