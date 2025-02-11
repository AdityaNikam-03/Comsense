package com.tbc.logics;

import com.tbc.Input.Scan;

public class Character_Occurence {

	public static void main(String[] args) {
		String str1;
		System.out.print("Enter String : ");
		str1=Scan.sc.nextLine();
		str1.toLowerCase();
		System.out.print("Enter Single Char : ");
		char ch=Scan.sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') { 
            ch = (char) ('Z' - (ch - 'A'));
        }
		
		int cnt=0;
	
		for(int i=0;i<str1.length();i++) {
			if(ch==str1.charAt(i)) {
				cnt++;
			}
		}
		System.out.println("Given Character had Occured "+cnt+" time..!");
	}

}
