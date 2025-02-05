package com.tbc.Encapsulation;

import com.tbc.Encapsulation.Student;

class Student{
	private String name;
	private int rollno;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRollno() {
		return this.rollno;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Aditya");
		s.setRollno(34);
		System.out.println("Name : "+s.getName()+" , "+"Roll Number : "+s.getRollno());
	}
}
