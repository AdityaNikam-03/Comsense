package com.tbc.ExceptionHandling.CustomException;
import com.tbc.Input.Scan;

class InvalidAgeException extends Exception{
	InvalidAgeException(){
		System.out.println("You cannot vote...!");
	}
	
	InvalidAgeException(String str){
		System.out.println("Message : "+str);
	}
}

public class Voting {

	public static void main(String[] args) throws InvalidAgeException{
		try {
			System.out.print("Enter Your Age : ");
			int age=Scan.sc.nextInt();
			if(age<18) {
				throw new InvalidAgeException();
			}
			System.out.println("You Can Vote.....!");
		}catch(InvalidAgeException e) {
			System.out.println("Invalid Age Exception Handled....!");
		}
	}

}
