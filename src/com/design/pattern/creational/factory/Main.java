package com.design.pattern.creational.factory;

public class Main {

	public static void main(String[] args) {
		FactoryPattern fp = new FactoryPattern();
		
		Animal animal = fp.getAnimal("Tiger");
		animal.eatFood();
		
		animal = fp.getAnimal("Lion");
		animal.eatFood();
		
		animal = fp.getAnimal("Leopard");
		animal.eatFood();
	}

}
