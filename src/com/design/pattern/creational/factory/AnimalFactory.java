package com.design.pattern.creational.factory;

import com.design.pattern.creational.abstractfactory.AbstractFactory;
import com.design.pattern.creational.abstractfactory.Vehicle;

public class AnimalFactory extends AbstractFactory {
	public Animal getAnimal(String animal) {
		if (animal.equals("Lion")) {
			return new Lion();
		} else if (animal.equals("Tiger")) {
			return new Tiger();
		} else if (animal.equals("Leopard")) {
			return new Leopard();
		}
		return null;
	}

	@Override
	public Vehicle getVehical(String vehicle) {
		return null;
	}
}
