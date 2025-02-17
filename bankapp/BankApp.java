package com.tbc.jdbcBanking;
import com.tbc.Input.Scan;

public class BankApp {

	public static void main(String[] args) {
		
		int ch=100;
		do {
			System.out.println("1.Create Bank Account");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Transfer Money");
			System.out.println("5.Get Loan");
			System.out.println("6.Pay Loan");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice : ");
			ch=Scan.sc.nextInt();
			switch(ch) {
				case 1:CreateBankAccount.addUser();
					break;
				case 2:DepositMoney.deposit();
					break;
				case 3:WithdrawMoney.withdraw();
					break;
				case 4:TransferMoney.transfer();
					break;
				case 5:Loan l=new Loan();
						l.getLoan();
						break;
				case 6:Loan l2=new Loan();
						l2.payLoan();
						break;
				default:if(ch==0) {System.out.println("Exited.....!");}
						else {System.out.println("Enter Proper Choice...!"+"\n");}
			}
		}while(ch!=0);

	}

}
