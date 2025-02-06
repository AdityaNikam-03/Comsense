package com.tbc.interfaces.Example9;
import com.tbc.Input.Scan;

public class Person {
	String name;
	int age;
	
	Person(){
		System.out.print("Enter Name : ");
		this.name=Scan.sc.nextLine();
		System.out.print("Enter Age : ");
		this.age=Scan.sc.nextInt();
	}
	
	void displayDetails() {
		System.out.println("-------------------");
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
