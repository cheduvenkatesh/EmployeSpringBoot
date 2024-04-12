package com.org.Employe.Service;

//EmployeeManager.java
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.Employe.Entity.Employee;
import com.org.Employe.Entity.Employees;

@Service
public class EmployeeManager {
 private Employees employees;

 // Constructor
 public EmployeeManager() {
     List<Employee> employeeList = new ArrayList<>();
    
     employeeList.add(new Employee(1, "Sree", "Thanu", "thanuSree@gmail.com", "Manager"));
     employeeList.add(new Employee(2, "Ram", "puthi", "ram@gmail.com", "Engineer"));
     employeeList.add(new Employee(3, "venkat", "chedu", "cheduvenkat@gmail.com", "Analyst"));
     this.employees = new Employees(employeeList);
 }

 public Employees getEmployees() {
     return employees;
 }
}
