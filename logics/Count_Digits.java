package com.tbc.logics;

public class Count_Digits {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int num;
		System.out.print("Enter Number : ");
		num=sc.nextInt();
		int dummy=num;
		int cnt=0;
		while(num!=0) {
			cnt++;
			num/=10;
		}
		
		System.out.println("There are "+cnt+" digits in "+dummy);
	}
}
