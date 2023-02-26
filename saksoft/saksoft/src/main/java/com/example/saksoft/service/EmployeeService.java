package com.example.saksoft.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.saksoft.dao.EmployeeRepository;
import com.example.saksoft.entity.Employee;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	

	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  employeeRepository.save(employee);
	}


	public String deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		return "delete successfully";
	}


	public Employee updateemployee(Employee employee, Long id) {
		Optional<Employee> opemp=employeeRepository.findById(id);
		 Employee emp= opemp.get();
		 emp.setId(employee.getId());
		 emp.setFirstName(employee.getFirstName());
		 emp.setLastName(employee.getLastName());
		 emp.setEmail(employee.getEmail());
		 emp.setAge(employee.getAge());
		return employeeRepository.save(emp);
	}


	public Optional<Employee> findemployeebyid(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

}
