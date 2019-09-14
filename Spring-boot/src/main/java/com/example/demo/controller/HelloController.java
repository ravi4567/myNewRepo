package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class HelloController {

	@Autowired
	private EmployeeRepo repository;


	@GetMapping("/hello")
	public String getNameUsingQueryParam(@RequestParam String req) {

		Employee emp=new Employee();
		emp.setName("Ravi");emp.setCountry("India");emp.setEmail("abc@gmail.com");
		repository.save(emp);
		return "Hello"+" "+emp;
	}

	@GetMapping("/hi{name}")
	public String getNameUsingPathParam(@PathVariable("name") String req) {
		return "Hello"+" "+req;
	}
	@GetMapping("/hellojs")
	public String getHello() {
		return "Hello JS";
	}


}



