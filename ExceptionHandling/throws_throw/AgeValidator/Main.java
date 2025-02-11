package com.tbc.ExceptionHandling.throws_throw.AgeValidator;
import com.tbc.Input.Scan;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Enter Age : ");
		int age=Scan.sc.nextInt();
		
		try {
			if(age<18) {
				throw new InvalidAge("You are UnderAge...so can't vote");
			}
			
			System.out.println("You are Eligible for Voting...!");
		}catch(InvalidAge e) {
			System.out.println(e.getMessage());
		}

	}

}
