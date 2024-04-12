package com.org.Employe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//EmployeeController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.Employe.Entity.Employees;
import com.org.Employe.Service.EmployeeManager;

@RestController
public class EmployeeController {
@Autowired
 private final EmployeeManager employeeManager;

@Autowired
 public EmployeeController(EmployeeManager employeeManager) {
     this.employeeManager = employeeManager;
 }

 @GetMapping("/employees")
 public Employees getEmployees() {
     return employeeManager.getEmployees();
 }
}
