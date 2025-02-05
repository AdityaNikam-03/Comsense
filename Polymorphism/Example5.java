package com.tbc.Polymorphism;

class Animall{
	void eat() {
		System.out.println("Animal Eats Food...!");
	}
	
	void sound() {
		System.out.println("Animal has a voice...!");
	}
}

class Tiger extends Animall{
	void eat() {
		System.out.println("Tiger eats Non-veg...!");
	}
	
	void sound() {
		System.out.println("Tiger's Sound....!");
	}
}

class Lion extends Animall{
	void eat() {
		System.out.println("Lion eats Non-veg.....!");
	}
	
	void sound() {
		System.out.println("Lion's Sound....!");
	}
}

class Panther extends Animall{
	void eat() {
		System.out.println("Panther eats Non-veg.....!");
	}
	
	void sound() {
		System.out.println("Panther's Sound.....!");
	}
}

public class Example5 {

	public static void main(String[] args) {
		Animall a=new Animall();
		a.eat();
		a.sound();
		System.out.println();
		
		a=new Tiger();
		a.eat();
		a.sound();
		System.out.println();
		
		a=new Lion();
		a.eat();
		a.sound();
		System.out.println();
		
		a=new Panther();
		a.eat();
		a.sound();
		System.out.println();
		
	}

}
