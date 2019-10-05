package com.design.pattern.creational.singleton;

import java.io.Serializable;

public final class Singleton implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	private static volatile Singleton INSTANCE;
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		
		return INSTANCE;
	}
		
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}
	
	protected Object readResolve() {
		return getInstance();
	}
	
	public void message() {
		System.out.println("I am class based Singleton");
	}
}
