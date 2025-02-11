package com.tbc.logics;

public class Perfect_Number {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int num;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(sum==num) {
			System.out.println("Pefect Number....!");
		}else {
			System.out.println("Not a Pefect Number.....!");
		}
	}

}
