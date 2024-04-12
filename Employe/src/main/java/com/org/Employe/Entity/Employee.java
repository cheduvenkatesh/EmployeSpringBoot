package com.org.Employe.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
 private int employee_id;
 private String first_name;
 private String last_name;
 private String email;
 private String title;

 // Constructor
 public Employee(int employee_id, String first_name, String last_name, String email, String title) {
     this.employee_id = employee_id;
     this.first_name = first_name;
     this.last_name = last_name;
     this.email = email;
     this.title = title;
 }

 // Getters
 public int getEmployee_id() {
     return employee_id;
 }

 public String getFirst_name() {
     return first_name;
 }

 public String getLast_name() {
     return last_name;
 }

 public String getEmail() {
     return email;
 }

 public String getTitle() {
     return title;
 }
}