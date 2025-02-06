package com.tbc.logic_codes;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr= {12,23,34,45,56,67,78,8,9,90,89};
		int[] arr1=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		System.out.println("New Array after copy");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}

	}

}
