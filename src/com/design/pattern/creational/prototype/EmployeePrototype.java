package com.design.pattern.creational.prototype;

import java.util.concurrent.ConcurrentHashMap;

public class EmployeePrototype {
	public static ConcurrentHashMap<Long, Employee> employeeConcurrentHashMap = new ConcurrentHashMap<>();
	
	public static Employee getEmployee(Long id) {
		Employee employee = employeeConcurrentHashMap.get(id);
		return employee.clone();
	}
	
	public static void load() {
		Manager manager = new Manager();
		manager.setId(1L);
		manager.setName("Vivek");
		
		Programmer programmer = new Programmer();
		programmer.setId(2L);
		programmer.setName("Sarika");
		
		employeeConcurrentHashMap.put(manager.getId(), manager);
		employeeConcurrentHashMap.put(programmer.getId(), programmer);
	}
}
