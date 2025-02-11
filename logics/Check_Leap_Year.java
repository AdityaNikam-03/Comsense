package com.tbc.logics;


public class Check_Leap_Year {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int year;
		System.out.print("Enter Year : ");
		year=sc.nextInt();
		if(year%100==0 || year%4==0) {
			System.out.println(year+" is a leap year.....!");
		}else {
			System.out.println(year+" is not a leap year.....!");
		}
	}
}
