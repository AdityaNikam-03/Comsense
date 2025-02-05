package com.tbc.Polymorphism;

class Animal{
	void sound() {
		System.out.println("Animal Sound...!");
	}
}

class Bird extends Animal{
	void sound() {
		System.out.println("Bird Sound.....!");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("Cat Sound.....!");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.sound();
		a=new Bird();
		a.sound();
		a=new Cat();
		a.sound();
	}

}
