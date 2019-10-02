package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.Animal;

public class Main {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProducer.getFactory("Animal");
		Animal animal = abstractFactory.getAnimal("Tiger");
		animal.eat();
		animal = abstractFactory.getAnimal("Lion");
		animal.eat();
		animal = abstractFactory.getAnimal("Leopard");
		animal.eat();
		
		abstractFactory = FactoryProducer.getFactory("Vehicle");
		Vehicle vehicle = abstractFactory.getVehical("Car");
		vehicle.type();
		vehicle = abstractFactory.getVehical("Truck");
		vehicle.type();
	}

}
