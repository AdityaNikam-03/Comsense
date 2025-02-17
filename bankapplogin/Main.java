package com.bankapplogin;

public class Main {

	public static void main(String[] args) {
		
		int ch=0;
		do {
			System.out.println("1.Create Account");
			System.out.println("2.Login to Existing Account");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice : ");
			ch=Scan.sc.nextInt();
			switch(ch) {
				case 1:CreateUserAccount.createAccount();
					break;
				case 2:System.out.print("Enter Account Number : ");
						int accNo=Scan.sc.nextInt();
						System.out.print("Enter Password : ");
						int pass=Scan.sc.nextInt();
						if(Authentication.authenticate(accNo,pass)) {
							int ch2=0;
							do {
								System.out.println("1.Deposit");
								System.out.println("2.Withdraw");
								System.out.println("3.Transfer");
								System.out.println("4.Get Loan");
								System.out.println("5.Pay Loan");
								System.out.println("0.Logout");
								System.out.print("Enter Your Choice : ");
								ch2=Scan.sc.nextInt();
								
								switch(ch2) {
									case 1:DepositMoney.deposit(accNo);
										break;
									case 2:WithdrawMoney.withdraw(accNo);
										break;
									case 3:TransferMoney.transfer(accNo);
										break;
									case 4:Loan l=new Loan();
											l.getLoan(accNo);
											break;
									case 5:Loan l1=new Loan();
											l1.payLoan(accNo);
											break;
									default:if(ch2==0) {System.out.println("Logged Out...!"+"\n");}
											else {System.out.println("Enter Proper Choice"+"\n");}
								}
							}while(ch2!=0);
						}
					break;
				default:if(ch==0) {System.out.println("Exited...!"+"\n");}
						else {System.out.println("Enter Proper Choice..!"+"\n");}
			}
			
		}while(ch!=0);
	}

}
