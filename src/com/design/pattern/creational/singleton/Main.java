package com.design.pattern.creational.singleton;

public class Main {

	public static void main(String[] args) {
		//Class based singleton
		Singleton.getInstance().message();
		//Enum based singleton
		SingletonEnum.INSTANCE.message();
	}

}
