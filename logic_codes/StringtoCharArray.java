package com.tbc.logic_codes;

import java.util.Scanner;

public class StringtoCharArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		
		char[] arr=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		
		System.out.println("The character Array is :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		

	}

}
