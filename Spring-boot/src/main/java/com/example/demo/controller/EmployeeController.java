package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeRepo repository;
	
	@GetMapping(value="/employees")
 	public List<Employee> getEmployees() {
		Iterator<Employee> emp= repository.findAll().iterator();
		List<Employee> list = new ArrayList<>();
		emp.forEachRemaining(list::add);
		return list;
		
	}
	
	@RequestMapping(value="/employee/{employeId}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable("employeId") int empId) {
		Optional<Employee> student = repository.findById(empId);

		if (!student.isPresent())
			return null;

		return student.get();
		
	}
	
	@RequestMapping(value="/employee",method=RequestMethod.POST,consumes="application/json")
	public Employee addEmpployee(@RequestBody Employee emp) {
		return repository.save(emp);
	}
	
	@RequestMapping(value="/employee/{empId}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("empId") int empId) {
		
		if (Integer.toString(empId) != null) {
			repository.deleteById(empId);
		}
		
	}
	
	@RequestMapping(value="/employee/{empId}",method=RequestMethod.PUT)
	public ResponseEntity<Object> updateEmployee(@PathVariable int empId,@RequestBody Employee employe) {
		
		Optional<Employee> studentOptional = repository.findById(empId);
		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();
			
			employe.setId(empId);
			repository.save(employe);
			return ResponseEntity.noContent().build();
		}
	
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public void addEmployees(@RequestBody List<Employee> employList) {
		repository.saveAll(employList);
		}
}
