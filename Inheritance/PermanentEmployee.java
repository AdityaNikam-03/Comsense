package com.tbc.Inheritance;
import com.tbc.Inheritance.Company;
import java.util.Scanner;

public class PermanentEmployee extends Company {
	private int empID;
	private String empName;
	private String contact;
	private String department;
	private String designation;
	private long basicSalary;
	private String grade;
	
	public void getData() {
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		this.empID=sc.nextInt();
		System.out.print("Enter Employee Name : ");
		sc.nextLine();
		this.empName=sc.nextLine();
		System.out.print("Enter Employee Contact : ");
		this.contact=sc.nextLine();
		System.out.print("Enter Employee Department : ");
		this.department=sc.nextLine();
		System.out.print("Enter Employee Designation : ");
		this.designation=sc.nextLine();
		System.out.print("Enter Employee Basic Salary : ");
		this.basicSalary=sc.nextLong();
		System.out.print("Enter Employee Grade : ");
		sc.nextLine();
		this.grade=sc.nextLine();
	}
	
	int getAllow(String grade) {
		if(grade.equals("A")) {
			return 1700;
		}else if(grade.equals("B")) {
			return 1500;
		}else {
			return 1300;
		}
} 
	
	long calculateSalary(long basicSalary) {
		
		return basicSalary+(long)(basicSalary*0.2)+(long)(basicSalary*0.5)+this.getAllow(this.grade)-(long)(basicSalary*0.11);
	}
	
	void printSlip() {
		long gross_salary=calculateSalary(this.basicSalary);
		System.out.println("--Salary Slip of Permanent Employee--");
		System.out.println("       "+getCompName());
		System.out.println("               "+getCompAddress());
		System.out.println("------------------------------------");
		System.out.println(this.empID+"             "+this.empName);
		System.out.println(this.contact+"      "+this.designation);
		System.out.println("------------------------------------");
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("Grade : "+grade);
		System.out.println("HRA : "+(long)(basicSalary*0.2));
		System.out.println("DA : "+(long)(basicSalary*0.5));
		System.out.println("Allow : "+this.getAllow(this.grade));
		System.out.println("PF : "+(long)(basicSalary*0.11));
		System.out.println("------------------------------------");
		System.out.println("Gross Salary : "+gross_salary);
		System.out.println("------------------------------------");
	}
}
