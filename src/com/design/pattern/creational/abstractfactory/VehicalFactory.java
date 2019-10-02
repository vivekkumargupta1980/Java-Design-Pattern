package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.Animal;

public class VehicalFactory extends AbstractFactory {
	public Vehicle getVehical(String vehicle) {
		if (vehicle.equals("Car")) {
			return new Car();
		} else if (vehicle.equals("Truck")) {
			return new Truck();
		}
		return null;
	}

	@Override
	public Animal getAnimal(String animal) {
		return null;
	}
}
