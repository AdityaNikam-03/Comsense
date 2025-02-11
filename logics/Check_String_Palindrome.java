package com.tbc.logics;

import com.tbc.Input.Scan;

public class Check_String_Palindrome {

	public static void main(String[] args) {
		String str;
		System.out.print("Enter String : ");
		str=Scan.sc.nextLine();
		str.toLowerCase();
	
		int i=0;
		int j=str.length()-1;
		int flg=1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flg=0;
				break;
			}
			
			i++;j--;
		}
		
		if(flg==1) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}

}
