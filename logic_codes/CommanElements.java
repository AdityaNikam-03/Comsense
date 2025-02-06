package com.tbc.logic_codes;

import java.util.Scanner;

public class CommanElements {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in first array");
		int n=sc.nextInt();
		int[] arr=new int[10];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of elements in Second array");
		int n1=sc.nextInt();
		int[] arr1=new int[10];
		System.out.println("Enter Array elements");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Comman elements :");
		
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n1;k++)
			{
				if(arr[j]==arr1[k])
				{
					System.out.println(arr[j]+" ");
				}
			}
		}

	}

}
