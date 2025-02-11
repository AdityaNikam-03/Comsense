package com.tbc.logics;


public class Fibonacci {
	public static void main(String[] args) {
		int n=13;
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
