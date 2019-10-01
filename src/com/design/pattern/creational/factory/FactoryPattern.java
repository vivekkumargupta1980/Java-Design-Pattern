package com.design.pattern.creational.factory;

public class FactoryPattern {
	Animal getAnimal(String animal) {
		if (animal.equals("Lion")) {
			return new Lion();
		} else if (animal.equals("Tiger")) {
			return new Tiger();
		} else if (animal.equals("Leopard")) {
			return new Leopard();
		}
		return null;
	}
}
