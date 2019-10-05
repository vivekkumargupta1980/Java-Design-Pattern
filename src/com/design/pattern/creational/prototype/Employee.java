package com.design.pattern.creational.prototype;

public abstract class Employee implements Cloneable {
	Long id;
	String name;
	
	abstract void work();
	
	public Employee clone() {
		Employee employee = null;
		try {
			employee = (Employee)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
