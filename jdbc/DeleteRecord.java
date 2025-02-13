package com.tbc.jdbc;
import com.tbc.Input.Scan;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DeleteRecord {
	public static void delete() {
		Connection con=DbConnection.connect();
		PreparedStatement stmt;
		ResultSet  rs;
		try {
			stmt=con.prepareStatement("select * from Student");
			rs=stmt.executeQuery();
			if(!rs.isBeforeFirst()) {
				System.out.println("Database is Empty...!"+"\n");
				return;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		System.out.print("Enter ID of which Record to be deleted : ");
		int id=Scan.sc.nextInt();
		System.out.println("Connection Successful..!");
		try {
			stmt=con.prepareStatement("select * from Student where id=?");
			stmt.setInt(1,id);
			rs=stmt.executeQuery();
			
			if(!rs.isBeforeFirst()) {
				throw new StudentNotExistException("Database not contains Record of Student..!");
			}else {
				stmt=con.prepareStatement("delete from Student where id=?");
				stmt.setInt(1,id);
				stmt.executeUpdate();
				System.out.println("Student Record Delete Successful...!"+"\n");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(StudentNotExistException e) {
			System.out.println(e.getMessage()+"\n"+"\n");
		}
	}
}
