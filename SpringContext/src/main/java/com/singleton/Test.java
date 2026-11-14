package com.singleton;

public class Test {

	public static void main(String[] args) {
		
		Employee emp= Employee.getEployee();
		System.out.println(emp.hashCode());
		Employee emp2=Employee.getEployee();
		System.out.println(emp2.hashCode());
	}

}
