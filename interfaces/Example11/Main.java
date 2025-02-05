package com.tbc.interfaces.Example11;
import com.tbc.Input.Scan;

public class Main {

	public static void main(String[] args) {
		SavingsAccount a=new SavingsAccount();
		
		int ch=0;
		
		do {
			
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Interest");
			System.out.println("4.Check Balance");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice : ");
			ch=Scan.sc.nextInt();
			
			switch(ch) {
				case 1:a.deposit();
					break;
				case 2:a.withdraw();
					break;
				case 3:a.calculateInterest();
					break;
				case 4:System.out.println("Account Balance is : "+a.getBalance()+"\n");
					break;
				default:if(ch==0) {
					System.out.println("Exited...!");
				}else {
					System.out.println("Enter Proper Choice...!"+"\n");
				}
			}
		}while(ch!=0);
	}

}
