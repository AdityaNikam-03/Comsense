package com.bankapplogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.SQLException;

public class WithdrawMoney {
	public static void withdraw(int accNum) {
		Connection con=DbConnection.connect();
		PreparedStatement stmt;
		
		try {
			stmt=con.prepareStatement("select * from Users where AccountNumber=?");
			stmt.setInt(1,accNum);
			ResultSet rs=stmt.executeQuery();
			
			rs.next();
			System.out.print("Enter Amount to be Withdraw : ");
			int amt=Scan.sc.nextInt();
			int bal=rs.getInt(4);
			if((bal-amt)<0) {
				throw new InsufficientFundException("Insufficient Fund....!");
			}else {
				stmt=con.prepareStatement("update Users set Balance=? where AccountNumber=?");
				stmt.setInt(1,(bal-amt));
				stmt.setInt(2, accNum);
				stmt.executeUpdate();
				System.out.println("Ammount WithDrawed Successful...!");
				System.out.println("Balance for Account Number "+accNum+" is "+(bal-amt)+"\n");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(InsufficientFundException e) {
			System.out.println(e.getMessage()+"\n");
		}
	}
}

