package com.tbc.logics;

import com.tbc.Input.Scan;

public class Find_In_Array {

	public static void main(String[] args) {
		System.out.print("Enter Number of Array Elements : ");
		int n=Scan.sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=Scan.sc.nextInt();
		}
		System.out.print("Enter Value to be Search : ");
		int key=Scan.sc.nextInt();
		int flg=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				flg=1;
				break;
			}
		}
		
		if(flg==1) {
			System.out.println("Key Present...!");
		}else {
			System.out.println("Key not Present...!");
		}
	}

}
