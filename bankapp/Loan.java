package com.tbc.jdbcBanking;
import com.tbc.Input.Scan;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Loan {
	int accNo;
	int loanAmt;
	
	public void getLoan(){
		System.out.print("Enter Account Number : ");
		this.accNo=Scan.sc.nextInt();
		Connection con=DbConnection.connect();
		PreparedStatement stmt;
	
		try {
			ResultSet rs;
			stmt=con.prepareStatement("select * from Loan where AccountNumber=?");
			stmt.setInt(1,accNo);
			rs=stmt.executeQuery();
			while(rs.next()) {
				if(rs.getInt("AccountNumber")==accNo && rs.getString(4).equals("Pending")) {
					System.out.println("You have already taken loan please clear it first..!"+"\n");
					return;
				}
				
			}
	
			stmt=con.prepareStatement("select * from Users where AccountNumber=?");
			stmt.setInt(1,accNo);
			rs=stmt.executeQuery();
			if(!rs.isBeforeFirst()) {
				throw new UserNotFoundException("No User Found in the Bank...!");
			}
			
			rs.next();
			if(rs.getInt(4)>=10000) {
				int loanAmt = (int) (rs.getInt(4) * 0.4);
				
				stmt=con.prepareStatement("select * from Loan where AccountNumber=?");
				stmt.setInt(1,accNo);
				rs=stmt.executeQuery();
				while(rs.next()) {
					
					if(rs.getInt("AccountNumber")==accNo && rs.getString(4).equals("Paid")) {
						stmt=con.prepareStatement("update Loan set Loan_Amount=?,Status=? where AccountNumber=?");
						stmt.setInt(1, loanAmt);
						stmt.setString(2,"Pending");
						stmt.setInt(3, accNo);
						stmt.executeUpdate();
						System.out.print("You are eligible for Loan and amount "+loanAmt+" is added as a loan to your account."+"\n");
						System.out.println("Loan Entry Added into Table Successful..!"+"\n");
						return;
					}
				}
				
				stmt=con.prepareStatement("insert into Loan(AccountNumber,Loan_Amount,Status) values(?,?,?)");
				stmt.setInt(1,accNo);
				stmt.setInt(2,loanAmt);
				stmt.setString(3, "Pending");
				stmt.executeUpdate();
				System.out.print("You are eligible for Loan and amount "+loanAmt+" is added as a loan to your account."+"\n");
				System.out.println("Loan Entry Added into Table Successful..!"+"\n");
			}else {
				System.out.println("You are not eligible for Loan...!");
				System.out.println("Minimum Balance for Loan should be 10000"+"\n");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(UserNotFoundException e) {
			System.out.println(e.getMessage()+"\n");
		}
	}
	
	public void payLoan() {
		System.out.print("Enter Your Account Number : ");
		int accNo=Scan.sc.nextInt();
		Connection con=DbConnection.connect();
		ResultSet rs;
		PreparedStatement stmt;
		try {
			stmt=con.prepareStatement("select * from Loan where AccountNumber=?");
			stmt.setInt(1,accNo);
			rs=stmt.executeQuery();
			
			if(!rs.next()) {
				stmt=con.prepareStatement("select * from Users where AccountNumber=?");
				stmt.setInt(1,accNo);
				ResultSet rs1=stmt.executeQuery();
				if(!rs.next()) {
					System.out.println("No User with Account Provided exists in Bank...!"+"\n");
				}
				return;
			}

			if(rs.getString(4).equals("Paid")) {
				System.out.println("You have already paid Your Loan....!"+"\n");
				return;
			}else {
				System.out.print("Your Ramaining Loan Amount is "+rs.getInt(3)+",how much do you want to pay : ");
				int amt=Scan.sc.nextInt();
				
				if((rs.getInt(3)-amt)==0) {
					stmt=con.prepareStatement("update Loan set Loan_Amount=?,Status=? where AccountNumber=?");
					stmt.setInt(1,0);
					stmt.setString(2,"Paid");
					stmt.setInt(3, accNo);
					stmt.executeUpdate();
					System.out.println("Total loan paid successful....!"+"\n");
				}else {
					stmt=con.prepareStatement("update Loan set Loan_Amount=? where AccountNumber=?");
					stmt.setInt(1,(rs.getInt(3)-amt));
					stmt.setInt(2, accNo);
					stmt.executeUpdate();
					System.out.println("Remaining Loan Amount is : "+(rs.getInt(3)-amt));
					System.out.println("Loan Amount "+amt+" Paid Successful...!"+"\n");
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
