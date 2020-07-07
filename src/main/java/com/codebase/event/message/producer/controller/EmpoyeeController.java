package com.codebase.event.message.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebase.event.message.producer.model.Employee;

@RestController
	public class EmpoyeeController {

		@GetMapping("/employee")
		public Employee firstPage() {

			Employee emp = new Employee();
			emp.setName("emp1");
			emp.setDesignation("manager");
			emp.setEmpId("1");
			emp.setSalary(3000);

			return emp;
		}

	}

