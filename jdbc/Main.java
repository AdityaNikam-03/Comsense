package com.tbc.jdbc;
import com.tbc.Input.Scan;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is Student Application...!");
		
		int ch=0;
		
		do {
			
			System.out.println("1.Insert Student Data");
			System.out.println("2.Retrive Student Data");
			System.out.println("3.Update Student Data");
			System.out.println("4.Delete Student Data");
			System.out.println("0.Exit");
			
			System.out.print("Enter Your Choice : ");
			ch=Scan.sc.nextInt();
			
			switch(ch){
				case 1:InsertStudent s=new InsertStudent();
						s.add();
						break;
				case 2:ReadData d=new ReadData();
						d.readData();
						break;
				case 3:UpdateStudentData us=new UpdateStudentData();
						us.update();
						break;
				case 4:DeleteRecord dr=new DeleteRecord();
						dr.delete();
						break;
				default:if(ch==0) {System.out.println("Exited...!");}
						else {System.out.println("Enter Proper Choice...!"+"\n");}
			}
			
		}while(ch!=0);
	}

}
