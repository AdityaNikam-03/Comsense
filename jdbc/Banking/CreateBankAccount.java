package com.tbc.jdbc.Banking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tbc.jdbc.DuplicateRecordException;

public class CreateBankAccount {
	public static void addUser() {
		User u=new User();
		Connection con=DbConnection.connect();
		System.out.println("Connection Successful..!");
		PreparedStatement stmt;
		
		try {
			
			stmt=con.prepareStatement("select * from Users;");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				if(u.accNo==rs.getInt(1)) {
					throw new DuplicateAccountException("Duplicate Primary Key..!");
				}
			}
			stmt=con.prepareStatement("insert into Users values(?,?,?,?)");
			stmt.setInt(1,u.accNo);
			stmt.setString(2,u.name);
			stmt.setInt(3,u.password);
			stmt.setInt(4,u.balance);
			stmt.executeUpdate();
			System.out.println("Account Created  Successfully....!"+"\n");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(DuplicateAccountException e) {
			System.out.println(e.getMessage()+"\n"+"\n");
		}
	}
}
