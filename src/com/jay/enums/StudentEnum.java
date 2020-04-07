package com.jay.enums;

public enum StudentEnum {
	AN("Ankit"), AS("Ashish"), JA("Jayhind");
	private StudentEnum(String name) {
		this.name = name;
	}
	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
}