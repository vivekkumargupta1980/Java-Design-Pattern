package com.design.pattern.creational.factory;

public class Main {

	public static void main(String[] args) {
		AnimalFactory fp = new AnimalFactory();
		
		Animal animal = fp.getAnimal("Tiger");
		animal.eat();
		
		animal = fp.getAnimal("Lion");
		animal.eat();
		
		animal = fp.getAnimal("Leopard");
		animal.eat();
	}

}
