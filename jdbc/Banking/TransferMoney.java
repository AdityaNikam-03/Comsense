package com.tbc.jdbc.Banking;
import java.sql.SQLException;
import com.tbc.Input.Scan;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class TransferMoney {
	public static void transfer() {
		System.out.print("Enter Sender's Account Number : ");
		int sender=Scan.sc.nextInt();
		System.out.print("Enter Receiver's Account Number : ");
		int receiver=Scan.sc.nextInt();
		ResultSet rs1;
		ResultSet rs2;
		PreparedStatement stmt;
		
		Connection con=DbConnection.connect();
		try {
			stmt=con.prepareStatement("select * from Users where AccountNumber=?");
			stmt.setInt(1,sender);
			rs1=stmt.executeQuery();
			stmt=con.prepareStatement("select * from Users where AccountNumber=?");
			stmt.setInt(1,receiver);
			rs2=stmt.executeQuery();
			
			if(rs1.isBeforeFirst() && rs2.isBeforeFirst()) {
				rs1.next();
				rs2.next();
				System.out.print("Enter Amount to be Transfer : ");
				int amt=Scan.sc.nextInt();
				int bal=rs1.getInt(4);
				if((bal-amt)<0) {
					throw new InsufficientFundException("Insufficient Fund in Sender's Account...!");
				}else {
					stmt=con.prepareStatement("update Users set Balance=? where AccountNumber=?");
					stmt.setInt(1,(bal-amt));
					stmt.setInt(2,sender);
					stmt.executeUpdate();
					System.out.println("Sender's Inital Balance is "+bal+" and after transfering "+amt+" balance is "+(bal-amt));
					bal=rs2.getInt(4);
					stmt=con.prepareStatement("update Users set Balance=? where AccountNumber=?");
					stmt.setInt(1,(bal+amt));
					stmt.setInt(2,receiver);
					stmt.executeUpdate();
					System.out.println("Receiver's Inital Balance is "+bal+" and after receiving "+amt+" balance is "+(bal+amt));
					System.out.println("Money Transfer Successfull...!"+"\n");
				}
			}else{
				throw new UserNotFoundException("Either Sender's or Resceiver's Account Number is invalid....!");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(InsufficientFundException e) {
			System.out.println(e.getMessage()+"\n");
		}catch(UserNotFoundException e) {
			System.out.println(e.getMessage()+"\n");
		}
	}
}
