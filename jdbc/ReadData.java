package com.tbc.jdbc;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ReadData {
	public void readData() {
		Connection con=DbConnection.connect();
		System.out.println("Connection Success..!");
		try {
			ResultSet rs=con.prepareStatement("select * from Student;").executeQuery();
			if(!rs.isBeforeFirst()) {
				System.out.println("Database is Empty...!"+"\n");
				return;
			}
			System.out.println(" ID  "+"   Name   "+"   DOB    "+"  Age   "+"  Address");
			while(rs.next()) {
				System.out.println(" "+rs.getInt(1)+"     "+rs.getString(2)+"  "+rs.getDate(3)+"   "+rs.getInt(4)+"       "+rs.getString(5));
			}
			
			System.out.println("\n"+"Whole Data Retrieved Successfull...!"+"\n");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
