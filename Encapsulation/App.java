package com.tbc.Encapsulation;
import com.tbc.Encapsulation.Studentt;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studentt s=new Studentt();
		
		System.out.print("Enter Student Name : ");
		s.setName(sc.nextLine());
		System.out.print("Enter PRN : ");
		s.setPRN(sc.nextLine());
		System.out.print("Enter Physics Marks : ");
		s.setPhyMarks(sc.nextInt());
		System.out.print("Enter Chemistry Marks : ");
		s.setChemMarks(sc.nextInt());
		System.out.print("Enter Biology Marks : ");
		s.setBioMarks(sc.nextInt());
		System.out.print("Enter Math Marks : ");
		s.setMathMarks(sc.nextInt());
		System.out.print("Enter English Marks : ");
		s.setEngMarks(sc.nextInt());
		System.out.print("Enter Marathi Marks : ");
		s.setMarMarks(sc.nextInt());
		
		s.calculatePercentage();
		s.getResult();
		s.display();
	}
}
