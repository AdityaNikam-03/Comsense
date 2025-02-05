package com.tbc.Polymorphism;
import java.util.Scanner;

class BankAccount{
	Scanner sc=new Scanner(System.in);
	int bankBalance;
	
	BankAccount(){
		bankBalance=5000;
	}
	
	void deposit(){
		System.out.print("Enter Amount to be Deposit : ");
		int amt=sc.nextInt();
		if(amt<=0) {
			System.out.println("Amount to be Deposit Cannot be Negative or Zero...!");
		}else {
			bankBalance+=amt;
			System.out.println("Amount Deposited Successfully....!");
		}
	}
	
	void withdraw() {
		System.out.println("Parent's Withdraw Method...!");
	}
	
	void checkBalance() {
		System.out.println("Account Balance is : "+bankBalance);
	}
	
	int getBalance() {
		return bankBalance;
	}
}

class CurrentAccount extends BankAccount{
	void withdraw() {
		System.out.print("Enter Amount to be Withdraw : ");
		int amt=sc.nextInt();
		
		if(amt<=0) {
			System.out.println("Ammount Cannot be Negative or Zero...!");
		}else if((getBalance()-amt)<0) {
			System.out.println("Insufficient Balance....!");
		}else {
			if(amt>6000) {
				System.out.println("You Withdraw Amount upto 6000...!");
			}else {
				super.bankBalance-=amt;
				System.out.println("Amount Withdraw Successfully....!");
			}
		}
	}
}

class SavingsAccount extends BankAccount{
	void withdraw() {
		System.out.print("Enter Amount to be Withdraw : ");
		int amt=sc.nextInt();
		
		if(amt<=0) {
			System.out.println("Ammount Cannot be Negative or Zero...!");
		}else {
			if(amt>1000) {
				System.out.println("You Withdraw Amount upto 1000...!");
			}else {
				super.bankBalance-=amt;
				System.out.println("Amount withdraw Successfully....!");
			}
		}
	}
}

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount b;
		int ch=0;
		do {
			System.out.println("Enter 1 for Savings Account");
			System.out.println("Enter 2 for Current Account");
			System.out.print("Enter Your Type of Account : ");
			ch=sc.nextInt();
			
			if(ch==1) {
				b=new SavingsAccount();
			}else if(ch==2) {
				b=new CurrentAccount();
			}else {
				b=null;
			}
			
		}while(ch!=1 && ch!=2);
		
		do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Account Balance ");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice : ");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:b.deposit();
					break;
				case 2:b.withdraw();
					break;
				case 3:b.checkBalance();
					break;
			}
		}while(ch!=0);
	}

}
