package com.tbc.jdbc;
import com.tbc.Input.Scan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateStudentData {
	public void update() {
		Connection con=DbConnection.connect();
		System.out.println("Connection Success..!");
		try {
			ResultSet rs=con.prepareStatement("select * from Student;").executeQuery();
			if(!rs.next()) {
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
					
					int ch=0;
					System.out.println("What Do you Want to Update : ");
					do {
						
						System.out.println("1.Name");
						System.out.println("2.Date of Birth");
						System.out.println("3.Age");
						System.out.println("4.Address");
						System.out.print("Enter Your Choice : ");
						ch=Scan.sc.nextInt();
						if(ch!=1 && ch!=2 && ch!=3 && ch!=4) {
							System.out.println("Enter Proper Choice...!");
						}
						
					}while(ch!=1 && ch!=2 && ch!=3 && ch!=4);
					
					if(ch==1) {
						stmt=con.prepareStatement("update Student set Name=? where ID=?");
						System.out.print("Enter New Name : ");
						Scan.sc.nextLine();
						String name=Scan.sc.nextLine();
						stmt.setString(1, name);
						stmt.setInt(2, id);
						stmt.executeUpdate();
					}else if(ch==2) {
						stmt=con.prepareStatement("update Student set DOB=? where ID=?");
						Scan.sc.nextLine();
						String dob=null;
						boolean flg=true;
						
						while(flg) {
							try {
								System.out.print("Enter New DOB (yyyy-mm-dd): ");
								dob=Scan.sc.nextLine();
								
								SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
								Date parseDate=null;
								parseDate=sdf.parse(dob);
								java.sql.Date d=new java.sql.Date(parseDate.getTime());
								stmt.setDate(1, d);
								stmt.setInt(2, id);
								stmt.executeUpdate();
								flg=false;
		
							}catch(ParseException e) {
								System.out.println("Enter Proper Date i.e yyyy-mm-dd"+"\n");
							}
						}
					}else if(ch==3) {
						int age=0;
						boolean flg=true;
						while(flg) {
							try {
								System.out.print("Enter New Age : ");
								age=Scan.sc.nextInt();
								flg=false;
							}catch(Exception e) {
								System.out.println("Enter only Integer...!");
								Scan.sc.nextLine();
							}
						}
						
						stmt=con.prepareStatement("update Student set Age=? where ID=?");
						stmt.setInt(1,age);
						stmt.setInt(2, id);
						stmt.executeUpdate();
					}else if(ch==4) {
						System.out.print("Enter Your New Address : ");
						Scan.sc.nextLine();
						String ad=Scan.sc.nextLine();
						stmt=con.prepareStatement("update Student set Address=? where ID=?");
						stmt.setString(1, ad);
						stmt.setInt(2,id);
						stmt.executeUpdate();
					}
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
