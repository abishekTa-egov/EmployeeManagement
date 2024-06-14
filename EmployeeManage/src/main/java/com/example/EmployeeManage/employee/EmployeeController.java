package com.example.EmployeeManage.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees(); //change
    }

    @GetMapping ("/id/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return this.employeeService.getEmployeeById(id);
    }

    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody Employee emp){
        return this.employeeService.createEmployee(emp);
    }

    @DeleteMapping("/delete-employee/id/{id}")
    public void deleteEmployee(@PathVariable Long id){
        this.employeeService.deleteEmployee(id);
    }

    @PutMapping("/update-employee/id/{id}")
    public Optional<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee emp){
        return this.employeeService.updateEmployee(id,emp);
    }



}
