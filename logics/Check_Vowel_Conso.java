package com.tbc.logics;
import java.util.Scanner;

public class Check_Vowel_Conso {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch;
		System.out.print("Enter Character : ");
		ch=sc.nextLine();
		if(ch.equals("A")||ch.equals("E")||ch.equals("I")||ch.equals("O")||ch.equals("U")) {
			System.out.println("Character is Vowel......!");
		}else if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")) {
			System.out.println("Character is Vowel......!");
		}else {
			System.out.println("Character is Consonant......!");
		}
	}
}
