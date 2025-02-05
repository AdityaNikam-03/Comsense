package com.tbc.Polymorphism;
import java.util.Scanner;

class Parentt{
	int a,b;
	void sum(Scanner sc) {
		System.out.print("Enter Value of A : ");
		this.a=sc.nextInt();
		System.out.print("Enter Value of B : ");
		this.b=sc.nextInt();
		System.out.println("Sum of "+this.a+" and "+this.b+" is "+(this.a+this.b));
		System.out.println("Sum Calculated in Parent Class...!");
		System.out.println();
	}
}

class Child1 extends Parentt{
	double a,b;
	void sum(Scanner sc) {
		System.out.print("Enter Value of A : ");
		this.a=sc.nextDouble();
		System.out.print("Enter Value of B : ");
		this.b=sc.nextDouble();
		System.out.println("Sum of "+this.a+" and "+this.b+" is "+(this.a+this.b));
		System.out.println("Sum Calculated in Child1 Class....!");
		System.out.println();
	}
}

class Child2 extends Parentt{
	char a,b;
	void sum(Scanner sc) {
		System.out.print("Enter First Character : ");
		this.a=sc.next().trim().charAt(0);
		System.out.print("Enter Second Character : ");
		this.b=sc.next().trim().charAt(0);
		System.out.println("Sum of "+this.a+" and "+this.b+" is "+(this.a+this.b));
		System.out.println("Sum Calculated in Child2 Class....!");
		System.out.println();
	}
}

public class Dynamic_Bind {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Parentt p=new Parentt();
		p.sum(sc);
		p=new Child1();
		p.sum(sc);
		p=new Child2();
		p.sum(sc);
	}

}
