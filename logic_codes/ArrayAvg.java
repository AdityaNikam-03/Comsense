package com.tbc.logic_codes;
import java.util.Scanner;
public class ArrayAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Array Elements : ");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Enter Numbers : ");
		for(int i=0;i<n;i++) {
			sum+=sc.nextInt();
		}
		System.out.println("Average is : "+sum/n);
	}

}
