package com.collabera.jdbc.dao;

public enum Department {
	
		ACCOUNTING(1), 
		HR(2), 
		DEVELOPMENT(3), 
		SALES(4);
	
	private final int value;
	
	private Department(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
