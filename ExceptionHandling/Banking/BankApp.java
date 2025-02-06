package com.tbc.ExceptionHandling.Banking;
import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long ac_no;
		double balance;
		String Name;
		
		System.out.println("Enter Account Number");
		ac_no=sc.nextLong();
		System.out.println("Enter Your Name");
		sc.nextLine();
		Name=sc.nextLine();
		System.out.println("Enter Initial Bakance");
		balance=sc.nextDouble();
		
		Bank account1=new Bank(ac_no,balance,Name);
		account1.showDetails();
		
		while(true)
		{
			int ch;
			System.out.println("********** MENU *************");
			System.out.println("         1=>Deposit");
			System.out.println("         2=>Withdraw");
			System.out.println("         3=>Check Balance");
			System.out.println("         4=>Exit");
			System.out.println("******************************");
			System.out.print("Enter your choice :");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				double DAmount;
				System.out.println("Enter Amount to Deposit");
				DAmount=sc.nextDouble();
				account1.deposit(DAmount);
				break;
			case 2:
				double WAmount;
				System.out.println("Enter Amount to Withdraw");
				WAmount=sc.nextDouble();
				account1.withdraw(WAmount);
				break;
			case 3:
				account1.showBalance();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}
		
	}

}