package com.flm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

@Component
public class EpmloyeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	public String saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
	
	public void deleteEmployee(int id) {
		
		Employee emp= new Employee(id, "", 0, "", "", 0);
		 employeeDao.deleteEmployee(emp);
		
	}
	
	public Employee findEmployeeById(int id) {
		
		return employeeDao.findEmployeeById(id);
	}
	
	public void updateEmployee(Employee emp) {
		 employeeDao.updateEmployee(emp);
		
	}
}
