package com.tbc.interfaces.Example7;

public class Main {
	public static void main(String[] args) {
		Employee e=new Engineer();
		e.work();
		e.walk();
		Student s=new CollegeStudent();
		s.study();
		s.walk();
	}
}
