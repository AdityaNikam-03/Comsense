package com.tbc.logic_codes;

import java.util.Scanner;

public class MaxMin {
	
	int findMax(int arr[],int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	int findMin(int arr[],int n)
	{
		int min=10000000;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n=sc.nextInt();
		int[] arr=new int[10];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		MaxMin one=new MaxMin();
		System.out.println("maximum is :"+one.findMax(arr, n)+" Minimum is :"+one.findMin(arr, n));
	}
}
;