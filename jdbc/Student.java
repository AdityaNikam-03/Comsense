package com.tbc.jdbc;
import com.tbc.Input.Scan;

public class Student {
	int id;
	String name;
	String DOB;
	int Age;
	String Address;
	
	Student(){
		boolean flg=true;
		
		while(flg) {
			try {
				System.out.print("Enter Student ID : ");
				this.id=Scan.sc.nextInt();
				Scan.sc.nextLine();
				System.out.print("Enter Student Name : ");
				this.name=Scan.sc.nextLine();
				System.out.print("Enter Date of Birth eg. yyyy-mm-dd : ");
				this.DOB=Scan.sc.nextLine();
				System.out.print("Enter Your Age : ");
				this.Age=Scan.sc.nextInt();
				System.out.print("Enter Address : ");
				Scan.sc.nextLine();
				this.Address=Scan.sc.nextLine();
				flg=false;
			}catch(Exception e){
				System.out.println("Enter Proper Data...!"+"\n");
				Scan.sc.nextLine();
			}
		}
	}
}
