package com.design.pattern.creational.builder;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer.Builder().withComputerName("Dell").build();
		System.out.println(computer);
	}

}
