package com.tbc.logics;

public class Sort_Numeric_String_Array {
	
	void arraySort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	void stringSort(String arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Number of Elements : ");
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements of Array : ");
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			arr[i]=k;
		}
		Sort_Numeric_String_Array obj=new Sort_Numeric_String_Array();
		obj.arraySort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.print("Enter Number of Elements for String Array : ");
		n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter String Array Elements : ");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			s[i]=str;
		}
		obj.stringSort(s, n);
		for(int i=0;i<n;i++) {
			System.out.println(s[i]+" ");
		}
	}

}
