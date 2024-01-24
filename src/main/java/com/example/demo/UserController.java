package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class UserController {

    @Autowired
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> allEmployees() {
        return employeeService.getAllEmployees();
    }

}
