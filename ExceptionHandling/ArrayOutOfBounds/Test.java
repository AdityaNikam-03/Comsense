package com.tbc.ExceptionHandling.ArrayOutOfBounds;

public class Test {

	public static void main(String[] args) {
		int[] arr=new int[5];
		
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of Bounds");
		}
	}

}
