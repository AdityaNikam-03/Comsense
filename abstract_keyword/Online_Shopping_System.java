package com.tbc.abstract_keyword;
import com.tbc.abstract_keyword.Input;

abstract class Product{
	private String Name;
	private double price;
	
	void setName(String str) {
		this.Name=str;
	}
	
	void setPrice(double price) {
		this.price=price;
	}
	
	void printDetails() {
		System.out.println("---Details----------------");
		System.out.println("Product Name : "+this.Name);
		System.out.println("Price : "+this.price);
		System.out.println("Discounted Price : "+getDiscountedPrice());
		System.out.println("--------------------------");
	}
	
	double getPrice() {
		return price;
	}

	abstract double getDiscountedPrice();
}

class Electronics extends Product{
	Electronics(){
		this.setName("Electronics");
		System.out.print("Enter Price for Electronics : ");
		this.setPrice(Input.sc.nextDouble());
	}
	double getDiscountedPrice() {
		return getPrice()*0.1;
	}
}

class Clothing extends Product{
	Clothing(){
		this.setName("Clothing");
		System.out.print("Enter Price for Clothing : ");
		this.setPrice(Input.sc.nextDouble());
	}
	double getDiscountedPrice() {
		return getPrice()*0.2;
	}
}

public class Online_Shopping_System {

	public static void main(String[] args) {
		Product p=new Electronics();
		p.printDetails();
		p=new Clothing();
		p.printDetails();
	}

}
