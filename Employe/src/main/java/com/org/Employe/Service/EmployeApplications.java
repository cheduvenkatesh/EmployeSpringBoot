package com.org.Employe.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeApplications {

    @Bean
     EmployeeManager employeeManager() {
        // Instantiate and configure your EmployeeManager bean here
        return new EmployeeManager();
    }
}
