package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.Animal;

public abstract class AbstractFactory {
	public abstract Animal getAnimal(String animal);
	public abstract Vehicle getVehical(String vehicle);
}
