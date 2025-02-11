package com.tbc.foodorderingsystem;
import com.tbc.Input.Scan;

public class Main {

	public static void main(String[] args) {
		System.out.print("Enter Your Name : ");
		String name=Scan.sc.nextLine();
		
		Order o=new Order();
		
		System.out.println("Press 1 to yes and 0 for No..");
		System.out.print("Do You Want to Order Pizza : ");
		if(Scan.sc.nextInt()==1) {
			System.out.print("Enter Quanity : ");
			o.addItem(new Pizza(Scan.sc.nextInt()));
		}
		System.out.print("Do You Want to Order Berger : ");
		if(Scan.sc.nextInt()==1) {
			o.addItem(new Berger());
		}
		System.out.print("Do You Want to Order Cold_Drinks : ");
		if(Scan.sc.nextInt()==1) {
			o.addItem(new Cold_Drinks());
		}
		o.generateBill(name);
	}

}
