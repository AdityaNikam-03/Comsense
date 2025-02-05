package com.tbc.Inheritance;
import java.util.Scanner;

public class Company {
	
	Scanner sc=new Scanner(System.in);
	
	private String compName;
	private String compAddress;
	private String compEmail;
	private String compContact;
	
	void getData() {
		System.out.print("Enter Company Name : ");
		this.compName=sc.nextLine();
		System.out.print("Enter Company Address : ");
		this.compAddress=sc.nextLine();
		System.out.print("Enter Company Email : ");
		this.compEmail=sc.nextLine();
		System.out.print("Enter Company Contact Number : ");
		this.compContact=sc.nextLine();
	}

	public Scanner getSc() {
		return sc;
	}

	public String getCompName() {
		return compName;
	}

	public String getCompAddress() {
		return compAddress;
	}

	public String getCompEmail() {
		return compEmail;
	}

	public String getCompContact() {
		return compContact;
	}

}
