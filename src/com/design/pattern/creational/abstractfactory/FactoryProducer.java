package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.AnimalFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if (factory.equals("Vehicle")) {
			return new VehicalFactory();
		} else if (factory.equals("Animal")) {
			return new AnimalFactory();
		}
		
		return null;
	}
}
