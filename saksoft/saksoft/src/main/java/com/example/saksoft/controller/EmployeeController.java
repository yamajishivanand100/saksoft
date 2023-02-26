package com.example.saksoft.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.saksoft.entity.Employee;
import com.example.saksoft.service.EmployeeService;

@RestController
public class EmployeeController {
 @Autowired
 
 EmployeeService employeeService;
  @PostMapping("/employee")
   public Employee createEmployee(@RequestBody Employee employee)
   {
	   return  employeeService.createEmployee(employee);
   }
  @DeleteMapping("/employee")
  public String deleteEmployeebyid(Long id){
	  return employeeService.deleteEmployee(id);
  }
  @PutMapping("/employee")
   public Employee updateemployee(@RequestBody Employee employee, @RequestParam Long id)
  {
	  return employeeService.updateemployee(employee, id) ;
  }
  
  @GetMapping("/employee/{id}")
  
  
   public  Optional<Employee> findemployeebyid(@PathVariable Long id)
   {
	  return employeeService.findemployeebyid (id);
   }
}
   
