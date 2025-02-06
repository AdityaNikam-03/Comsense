package com.tbc.ExceptionHandling.IllegalArgumentException;
import com.tbc.Input.Scan;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.print("Enter Age : ");
			int age=Scan.sc.nextInt();
			if(age<0) {
				throw new IllegalArgumentException("Age Cannot be Negative");
			}
			System.out.println("Entered Age : "+age);
		}catch(IllegalArgumentException e) {
			System.out.println("Message is : "+e.getMessage());
		}

	}

}
