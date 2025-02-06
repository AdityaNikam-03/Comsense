package com.tbc.logic_codes;

public class Sort {
	
	void numericSort(int arr[],int length)
	{
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	void charSort(char arr[],int length)
	{
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {12,56,3,23,78,34,45,25,17};
		int arrlength=arr.length;
		
		char arr1[]= {'Z','A','P','C','T','D','B'};
		int arr1length=arr1.length;
		
		Sort sort=new Sort();
		sort.numericSort(arr, arrlength);
		System.out.println();
		System.out.println("*********************************************************");
		sort.charSort(arr1, arr1length);
	}

}
