package com.tbc.jdbc;
import com.tbc.Input.Scan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateStudentData {
	public void update() {
		Connection con=DbConnection.connect();
		System.out.println("Connection Success..!");
		try {
			ResultSet rs=con.prepareStatement("select * from Student;").executeQuery();
			if(!rs.isBeforeFirst()) {
				System.out.println("Database is Empty...!"+"\n");
				return;
			}
			
			System.out.print("Enter ID of Student of which Data to be Update : ");
			int id=Scan.sc.nextInt();
			try {
				PreparedStatement stmt=con.prepareStatement("select * from Student where id=?");
				stmt.setInt(1,id);
				rs=stmt.executeQuery();
				if(!rs.isBeforeFirst()) {
					throw new StudentNotExistException("Database not contains Record of Student..!");
				}else {
					stmt=con.prepareStatement("update Student set Name=? where ID=?");
					System.out.print("Enter New Name : ");
					Scan.sc.nextLine();
					String name=Scan.sc.nextLine();
					stmt.setString(1, name);
					stmt.setInt(2, id);
					stmt.executeUpdate();
					System.out.println("Student Data Update Successful....!"+"\n");
				}
				
			}catch(StudentNotExistException e) {
				System.out.println(e.getMessage()+"\n"+"\n");
			}catch(Exception e) {
				System.out.println(e.getMessage()+"\n"+"\n");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
