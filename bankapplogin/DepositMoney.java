package com.bankapplogin;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepositMoney {
	public static void deposit(int accNum) {
		
		Connection con=DbConnection.connect();
		PreparedStatement stmt;
		
		try {
			stmt=con.prepareStatement("select * from Users where AccountNumber=?");
			stmt.setInt(1,accNum);
			ResultSet rs=stmt.executeQuery();
			
			System.out.print("Enter amount to be deposited : ");
			int amt=Scan.sc.nextInt();
			rs.next();
			int bal=rs.getInt(4);
			stmt=con.prepareStatement("update Users set Balance=? where AccountNumber=?");
			stmt.setInt(1,amt+bal);
			stmt.setInt(2,accNum);
			stmt.executeUpdate();
			System.out.println("Amount Deposited Successfully....!");
			System.out.println("Account Balance for "+accNum+" is "+(amt+bal)+"."+"\n");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
