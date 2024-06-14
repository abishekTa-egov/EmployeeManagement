package com.example.EmployeeManage.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    long id ;        //make PK
    String firstName;
    String lastName;
    String email;
    String department;
    double salary;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String email, String department, double salary) {
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.department=department;
        this.salary=salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
