package com.design.pattern.creational.builder;

public class Computer {
	private String computerName;
	
	private Computer() {}
	public static class Builder {
		private String computerName;
		
		public Builder withComputerName(String computerName) {
			this.computerName = computerName;
			return this;
		}
		
		public Computer build() {
			Computer computer = new Computer();
			computer.computerName = this.computerName;
			return computer;
		}
	}
	
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + "]";
	}
}
