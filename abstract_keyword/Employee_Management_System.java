package com.tbc.abstract_keyword;
import com.tbc.abstract_keyword.Input;

abstract class Employee{
	private String name;
	private String Emp_type;
	private int id;
	private int salary;
	
	Employee(){
		System.out.print("Enter Employee Name : ");
		this.name=Input.sc.nextLine();
		System.out.print("Enter Employee ID : ");
		id=Input.sc.nextInt();
		System.out.print("Enter Salary : ");
		salary=Input.sc.nextInt();
	}
	
	/*Employee(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}*/
	
	abstract int calculateBonus();
	void displayDetails() {
		System.out.println("-----Details------------------------");
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Type : "+this.Emp_type);
		System.out.println("Employee Salary : "+this.salary);
		System.out.println("Bonus : "+this.calculateBonus());
		System.out.println("------------------------------------");
	}
	
	int getSalary() {
		return salary;
	}
	
	void setEmp_type(String str) {
		this.Emp_type=str;
	}
}

class FullTimeEmployee extends Employee{
	int calculateBonus(){
		int sal=this.getSalary();
		return (int)(sal*0.2);
	}
	
	FullTimeEmployee(){
		super();
		this.setEmp_type("Full Time");
	}
}

class PartTimeEmployee extends Employee{
	int calculateBonus() {
		int sal=this.getSalary();
		return (int)(sal*0.1);
	}
	
	PartTimeEmployee(){
		super();
		this.setEmp_type("Part Time");
	}
}

public class Employee_Management_System {

	public static void main(String[] args) {
		Employee e=new PartTimeEmployee();
		e.displayDetails();
	}

}
