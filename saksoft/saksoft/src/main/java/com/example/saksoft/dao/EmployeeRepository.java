package com.example.saksoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.saksoft.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
