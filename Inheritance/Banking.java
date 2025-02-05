package com.tbc.Inheritance;
import java.util.Scanner;

class AccountDetails{
	
	private String accNo;
	private String name;
	private String bankname;
	private long balance;
	
	public void addUser(Scanner sc) {
		System.out.print("Enter Bank Name : ");
		this.bankname=sc.nextLine();
		System.out.print("Enter Account Holder's Name : ");
		this.name=sc.nextLine();
		System.out.print("Enter Account Number : ");
		this.accNo=sc.nextLine();
		this.balance=5000;
	}
	
	public void viewUser() {
		System.out.println("Bank Name : "+this.bankname);
		System.out.println("Acc. Holder's Name : "+this.name);
		System.out.println("Account Number : "+this.accNo);
		System.out.println("Balance Amount : "+this.balance);
		System.out.println();
	}
	
	public void checkBalance() {
		System.out.println("Account Number : "+this.accNo);
		System.out.println("Balance Amount : "+this.balance);
		System.out.println();
	}
	
	void setBalance(long amount) {
		this.balance=amount;
	}
	
	long getBalance() {
		return balance;
	}
}

class AmountDeposit extends AccountDetails{
	private long amount;
	
	public void deposit(Scanner sc) {
		System.out.println("Enter Amount to be Deposit : ");
		amount=sc.nextLong();
		if(amount<=0) {
			System.out.println("Amount Cannot be negative....!");
		}else {
			this.amount=amount+getBalance();
			this.setBalance(amount);
			System.out.println("Deposit Successful....!");
		}
		
		System.out.println();
	}
}

class AmountWithdraw extends AmountDeposit{
	private long amount;
	
	public void withdraw(Scanner sc) {
		System.out.print("Enter Amount that is to be withdraw : ");
		amount=sc.nextLong();
		if(amount<=0) {
			System.out.println("Withdraw Amount Cannot be Negative...!");
		}else if((getBalance()-amount)<5000) {
			System.out.println("Insufficient Balance...!");
		}else {
			this.amount=getBalance()-amount;
			this.setBalance(amount);
			System.out.println("Amount Withdraw Successful.....!");
		}
		System.out.println();
	}
}

public class Banking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AmountWithdraw a=new AmountWithdraw();
		a.addUser(sc);
		System.out.println();
		a.viewUser(); 
		System.out.println();
		
		int ch=1;
		
		do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.View User Details");
			System.out.println("0.Exit");
			System.out.println("Enter Your Choice : ");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:a.deposit(sc);
					break;
				case 2:a.withdraw(sc);
					break;
				case 3:a.checkBalance();
					break;
				case 4:a.viewUser();
					break;
			}
		}while(ch!=0);
	}

}
