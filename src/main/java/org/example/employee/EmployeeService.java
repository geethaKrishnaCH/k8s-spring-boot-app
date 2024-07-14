package org.example.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeData employeeData;

    public List<Employee> getAll() {
        return employeeData.getEmployees();
    }

    public Employee getById(long id) {
        List<Employee> employees = employeeData.getEmployees();
        Employee employee = employees.stream().filter(emp -> emp.getId() == id).findFirst().orElseThrow();
        return employee;
    }
}
