package com.tbc.logics;
import com.tbc.Input.Scan;

public class String_Reverse {

	public static void main(String[] args) {
		String str1,str2="";
		System.out.print("Enter String : ");
		str1=Scan.sc.nextLine();
		int i=0;
		int j=str1.length();
		char ch;
		
		while(i<j) {
			ch=str1.charAt(i);
			str2=ch+str2;
			i++;
		}
		System.out.println("Reversed String");
		System.out.println(str2);
	}

}
