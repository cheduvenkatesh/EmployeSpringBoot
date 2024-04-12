package com.org.Employe.Entity;


import java.util.List;

import jakarta.persistence.Entity;


public class Employees {
	
 private List<Employee> employees;

 // Constructor
 public Employees(List<Employee> employees) {
     this.employees = employees;
 }

 // Getter and Setter
 public List<Employee> getEmployees() {
     return employees;
 }

 public void setEmployees(List<Employee> employees) {
     this.employees = employees;
 }
}
