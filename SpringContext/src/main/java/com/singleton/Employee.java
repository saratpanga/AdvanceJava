package com.singleton;

public class Employee {
	
	private static Employee employee=null;
	private Employee() {
		
	}
	
	public static Employee getEployee() {
		
		if(employee==null) {
			employee=new Employee();
			return employee;
		}
		return employee;
		
	}
}
