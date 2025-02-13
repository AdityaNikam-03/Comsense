package com.tbc.jdbc.Banking;
import com.tbc.Input.Scan;

public class User {
	int accNo;
	String name;
	int password;
	int balance;
	
	User(){
		boolean flg=true;
		
		while(flg) {
			try {
				System.out.print("Enter Acount Number : ");
				this.accNo=Scan.sc.nextInt();
				Scan.sc.nextLine();
				System.out.print("Enter Account Holder's Name : ");
				this.name=Scan.sc.nextLine();
				System.out.print("Enter Password for Account : ");
				this.password=Scan.sc.nextInt();
				this.balance=0;
				flg=false;
			}catch(Exception e){
				System.out.println("Enter Proper Data...!"+"\n");
				Scan.sc.nextLine();
			}
		}
	}
}
