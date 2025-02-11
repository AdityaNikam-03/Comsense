package com.tbc.logics;
import com.tbc.Input.Scan;

public class Array_Average {

	public static void main(String[] args) {
		
		System.out.print("Enter Number of Array Elements : ");
		int n=Scan.sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=Scan.sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of Array Elements : "+sum/n);
	}

}
