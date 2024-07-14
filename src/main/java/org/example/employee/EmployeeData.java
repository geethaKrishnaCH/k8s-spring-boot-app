package org.example.employee;

import lombok.Data;
import org.example.employee.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class EmployeeData {
    private List<Employee> employees;

    public void populate() {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(Employee.builder().id(1).name("Geetha Krishna").role("DEVELOPER").build());
        employees.add(Employee.builder().id(2).name("Jhansi D").role("DEVELOPER").build());
        employees.add(Employee.builder().id(3).name("Suman").role("ARCHITECT").build());
        employees.add(Employee.builder().id(4).name("Sagar Jadhav").role("PROJECT_MANAGER").build());
        employees.add(Employee.builder().id(5).name("Yash K").role("DEVELOPER").build());
    }
}
