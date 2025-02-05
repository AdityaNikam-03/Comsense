package com.tbc.abstract_keyword;
import com.tbc.abstract_keyword.Input;

abstract class BankAccount{
	int accountBalance,balance;
	void deposit(int amount) {
		if(amount<=0) {
			System.out.println("Amount to be Deposit cannot be zero or Negative...!"+"\n");
			return;
		}
		balance+=amount;
		System.out.println("Amount Deposited..!"+"\n");
	}
	
	int getBalance() {
		return balance;
	}
	
	abstract void withDraw(int amount);
}

class SavingsAccount extends BankAccount{
	void withDraw(int amount) {
		if(amount<=0) {
			System.out.println("Amount to be withdraw cannot be zero or Negative...!"+"\n");
			return;
		}
		
		if((super.balance-amount)>=1000) {
			super.balance-=amount;
			System.out.println("Amount Withdrawed Successful...!!"+"\n");
		}else{
			System.out.println("Insufficient Balance..!"+"\n");
		}
	}
}

class CurentAccount extends BankAccount{
	void withDraw(int amount) {
		if(amount<=0) {
			System.out.println("Amount to be withdraw cannot be zero or Negative...!"+"\n");
			return;
		}
		
		if((super.balance-amount)>=0) {
			super.balance-=amount;
			System.out.println("Amount Withdrawed Successful...!!"+"\n");
		}else{
			System.out.println("Insufficient Balance..!"+"\n");
		}
	}
}


public class Mobile_Banking_System {

	public static void main(String[] args) {
		BankAccount act=null;
		
		int ch;
		do {
			
			System.out.println("1.Press 1 for Savings Account..!");
			System.out.println("2.Press 2 for Current Account..!");
			System.out.print("Enter Your Choice : ");
			ch=Input.sc.nextInt();
			
			if(ch==1) {
				act=new SavingsAccount();
				System.out.println("You have choosen Savings Account..!"+"\n");
			}else if(ch==2) {
				act=new CurentAccount();
				System.out.println("You have choosed Current Account..!"+"\n");
			}else {
				System.out.println("Enter Proper Choice...!");
			}
		}while(ch!=1 && ch!=2);
		
		do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdrawl");
			System.out.println("3.Check Balance");
			System.out.println("0.Exit");
			System.out.print("Enter your Choice : ");
			ch=Input.sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.print("Enter Amount to be Deposit : ");
					act.deposit(Input.sc.nextInt());
					break;
				case 2:
					System.out.print("Enter Amount to be Withdraw : ");
					act.withDraw(Input.sc.nextInt());
					break;
				case 3:
					System.out.println("Account Balance is : "+act.getBalance()+"\n");
					break;
				default:if(ch==0) {System.out.println("Exited....!");}
						else{System.out.println("Enter Proper Choice..!"+"\n");};
			}
		}while(ch!=0);
	}

}
