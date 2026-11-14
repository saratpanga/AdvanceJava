package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.flm.model.Employee;
import com.flm.service.EpmloyeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeController {

	@Autowired
	EpmloyeeService employeeService;

	@GetMapping("/employees")
	public String employees(Model model) {
		List<Employee> employees=employeeService.getAllEmployees();
		model.addAttribute("empList", employees);
		return "employees";
	}
	
	@GetMapping("/newemployee")
	public String addEmployee() {
		return "employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(HttpServletRequest request) {
		String empname = request.getParameter("empname");
		String empemail = request.getParameter("empemail");
		int empage = Integer.parseInt(request.getParameter("empage"));
		double empsalary =Double.parseDouble(request.getParameter("empsalary"));
		String empdept = request.getParameter("empdept");
		
		Employee emp=new Employee(empname,empsalary,empdept,empemail,empage);
		
		employeeService.saveEmployee(emp);
		return "redirect:/flm/employees";
	}
	
	@GetMapping("/employees/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		
		employeeService.deleteEmployee(id);
		
		return "redirect:/flm/employees";
	}
	
	@GetMapping("/employees/update/{id}")
	public String updateEmployee(@PathVariable("id") int id , Model model) {
		
		Employee employee = employeeService.findEmployeeById(id);
		
		if(employee == null) {
			return "redirect:/flm/employees";
		}
		
		model.addAttribute("employee", employee);
		return "edit-employee";
	}
	
	@PostMapping("/employees/update")
	public String updateEmployee(HttpServletRequest request) {
		
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empname = request.getParameter("empname");
		String empemail = request.getParameter("empemail");
		int empage = Integer.parseInt(request.getParameter("empage"));
		double empsalary =Double.parseDouble(request.getParameter("empsalary"));
		String empdept = request.getParameter("empdept");
		
		Employee emp= new Employee(empId, empname, empsalary, empdept, empemail, empage);
		
		employeeService.updateEmployee(emp);
		
		return "redirect:/flm/employees";
	}

}
