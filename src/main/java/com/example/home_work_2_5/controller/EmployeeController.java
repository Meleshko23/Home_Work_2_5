package com.example.home_work_2_5.controller;


import com.example.home_work_2_5.model.Employee;
import com.example.home_work_2_5.servis.EmployeeServis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")


public class EmployeeController {

    private final EmployeeServis employeeServis;

    public EmployeeController(EmployeeServis employeeServis) {
        this.employeeServis = employeeServis;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String name,
                                @RequestParam("lastName") String surname) {
        return employeeServis.addEmployee(name, surname);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String name,
                                @RequestParam("lastName") String surname) {
        return employeeServis.findEmployee(name, surname);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("firstName") String name,
                                 @RequestParam("lastName") String surname) {
        return employeeServis.removeEmployee(name, surname);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeServis.getAll();
    }

}
