package com.tbc.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;

public class InsertStudent {
	public void add(){
		Student s=new Student();
		Connection con=DbConnection.connect();
		
		System.out.println("Connection Success..!");
		PreparedStatement stmt;
		try {
			stmt=con.prepareStatement("select * from Student;");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				if(s.id==rs.getInt(1)) {
					throw new DuplicateRecordException("Duplicate Primary Key..!");
				}
			}
			
			stmt = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?, ?, ?)");
			stmt.setInt(1,s.id);
			stmt.setString(2,s.name);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
			Date parseDate=null;
			try {
				parseDate=sdf.parse(s.DOB);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			java.sql.Date d=new java.sql.Date(parseDate.getTime());
			stmt.setDate(3,d);
			stmt.setInt(4,s.Age);
			stmt.setString(5,s.Address);
			stmt.executeUpdate();
			System.out.println("Data of Student inserted into Database is Successful...!"+"\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(DuplicateRecordException e) {
			System.out.print(e.getMessage()+"\n"+"\n");
		}
		
	}
}
