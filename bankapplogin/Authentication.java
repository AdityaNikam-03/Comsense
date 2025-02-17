package com.bankapplogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;

public class Authentication {
	public static boolean authenticate(int accNo,int pass) {
		boolean flg=false;
		
		Connection con=DbConnection.connect();
		PreparedStatement stmt;
		ResultSet rs;
		
		try {
			stmt=con.prepareStatement("select * from Users where AccountNumber=?");
			stmt.setInt(1, accNo);
			rs=stmt.executeQuery();
			
			if(rs.next()) {
				stmt=con.prepareStatement("select * from Users where AccountNumber=?");
				stmt.setInt(1, accNo);
				rs=stmt.executeQuery();
				
				if(rs.next()) {
					int storedPass=rs.getInt("Password");
					if(pass!=storedPass) {
						System.out.println("Password is Incorrect...!"+"\n");
					}else {
						System.out.println("Login Successfull...!"+"\n");
						flg=true;
					}
				}
			}else {
				System.out.println("User with Provided Account Not exists...!"+"\n");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flg;
	}
}
