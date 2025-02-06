package com.tbc.logic_codes;

import java.util.Scanner;

public class SearchElement {
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
		System.out.println("Enter the element to search");
		int search=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
