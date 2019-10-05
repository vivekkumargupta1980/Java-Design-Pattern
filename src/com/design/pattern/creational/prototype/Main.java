package com.design.pattern.creational.prototype;

public class Main {

	public static void main(String[] args) {
		EmployeePrototype.load();
		Employee employee = EmployeePrototype.getEmployee(1L);
		System.out.println(employee);
	}

}
