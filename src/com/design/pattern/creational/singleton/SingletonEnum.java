package com.design.pattern.creational.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public void message() {
		System.out.println("I am enum based Singleton");
	}
}
