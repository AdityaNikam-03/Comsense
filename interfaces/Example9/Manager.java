package com.tbc.interfaces.Example9;
import com.tbc.Input.Scan;

public class Manager extends Person implements Employee{
	
	public void getSalary() {
		System.out.print("Enter Salary : ");
		int sal=Scan.sc.nextInt();
		this.displayDetails();
		System.out.println("Salary : "+sal);
		System.out.println("-------------------");
	}
}
