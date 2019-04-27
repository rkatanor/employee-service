package com.bf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bf.model.Employee;

@RestController
@RequestMapping("/rs")
public class EmployeeController {
	@GetMapping(value = "/getemployees")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setFirstName("Rajkumar");
		emp.setLastName("katanor");
		emp.setEmail("rkatanor@gmail.com");
		emp.setSsn("231-44-8765");
		emp.setAddress("lb nagar");
		return emp;
	}
}
