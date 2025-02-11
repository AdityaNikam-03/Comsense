package com.tbc.logics;
import com.tbc.Input.Scan;

public class Count_Vowel_Conso {

	public static void main(String[] args) {
		String str;
		System.out.print("Enter String : ");
		str=Scan.sc.nextLine();
		str.toLowerCase();
		int vwl=0;
		int con=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vwl++;
			}else {
				con++;
			}
		}
		
		System.out.println("Number of Vowels : "+vwl);
		System.out.println("Number of Consonants : "+con);
	}	
}
