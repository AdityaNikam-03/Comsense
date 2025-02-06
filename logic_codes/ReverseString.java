package com.tbc.logic_codes;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String str=sc.nextLine();
		System.out.println("Reversed String is");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
