package com.tbc.Encapsulation;

class Employee{
	private String name;
	private static String cName;
	private static String cAddress;
	private String dept;
	private long mobNo;
	private String designation;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getMobNo() {
		return mobNo;
	}
	
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	static {
		cName="Comsense Technologies";
		cAddress="Pune";
	}
	
	void print() {
		System.out.println("-------------------------------");
		System.out.println("    "+this.cName);
		System.out.println("           "+this.cAddress);
		System.out.println("-------------------------------");
		System.out.println("Name : "+this.name);
		System.out.println("Department : "+this.dept);
		System.out.println("Designation : "+this.designation);
		System.out.println("Mobile Number : "+this.mobNo);
		System.out.println("-------------------------------");
	}
}

public class Main {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Aditya");
		e.setDept("Software");
		e.setDesignation("Developer");
		e.setMobNo(9028);
		
		e.print();
	}
}
