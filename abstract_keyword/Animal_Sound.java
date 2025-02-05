package com.tbc.abstract_keyword;

abstract class Animal{
	private String name;
	abstract void makeSound();
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Barks");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Meows");
	}
}

public class Animal_Sound {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.makeSound();
		a=new Cat();
		a.makeSound();
	}

}
