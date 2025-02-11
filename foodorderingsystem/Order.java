package com.tbc.foodorderingsystem;
import java.util.List;
import java.util.ArrayList;

public class Order {
	List<Food> lst;
	
	Order(){
		lst=new ArrayList<>();
	}
	
	void addItem(Food it) {
		lst.add(it);
	}
	
	void generateBill(String name) {
		System.out.println("--------------------------------");
		System.out.println("Customer Name : "+name);
		System.out.println("--------------------------------");
		int total=0;
		for(int i=0;i<lst.size();i++) {
			Food d=lst.get(i);
			total+=d.billing();
		}
		System.out.println("--------------------------------");
		System.out.println("Total Amount : "+total);
		System.out.println("--------------------------------");
	}
}
