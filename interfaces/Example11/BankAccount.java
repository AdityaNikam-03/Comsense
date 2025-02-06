package com.tbc.interfaces.Example11;
import com.tbc.Input.Scan;

public class BankAccount {
	private long balance;
	
	BankAccount(){
		this.balance=0;
	}
	
	void deposit() {
		System.out.print("Enter Amount to be Deposit:");
		long amt=Scan.sc.nextInt();
		balance+=amt;
		System.out.println("Amount Deposited..!"+"\n");
	}
	void withdraw() {
		System.out.print("Enter Amount to be Withdraw:");
		long amt=Scan.sc.nextInt();
		if(amt<=0) {
			System.out.println("Amount Cannot be zero or negative.....!"+"\n");
		}else if(balance-amt<0) {
			System.out.println("Insufficient Balance...!"+"\n");
		}else {
			balance-=amt;
			System.out.println("Amount Withdrawed..!"+"\n");
		}
	}
	
	long getBalance() {
		return this.balance;
	}
}
