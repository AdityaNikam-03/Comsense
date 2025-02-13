package com.tbc.jdbc.Banking;
import com.tbc.Input.Scan;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Loan {
	int accNo;
	int loanAmt;
	String status;
	
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
			
			if(rs.next()) {
				System.out.println("You have already taken loan please clear it first..!"+"\n");
				return;
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
				System.out.print("You are eligible for Loan and amount "+loanAmt+" is added as a loan to your account."+"\n");
				this.status="Pending";
				stmt=con.prepareStatement("insert into Loan(AccountNumber,Loan_Amount,Status) values(?,?,?)");
				stmt.setInt(1,accNo);
				stmt.setInt(2,loanAmt);
				stmt.setString(3, status);
				stmt.executeUpdate();
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
}
