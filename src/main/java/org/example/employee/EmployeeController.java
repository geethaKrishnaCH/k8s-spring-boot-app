package org.example.employee;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @RequestMapping(method = GET)
    ResponseEntity<?> employees() {
        List<Employee> employees = employeeService.getAll();
        return new ResponseEntity<>(employees, OK);
    }

    @RequestMapping(value = "/{id}", method = GET)
    ResponseEntity<?> employeeById(@PathVariable("id") long id) {
        Employee employee = employeeService.getById(id);
        return new ResponseEntity<>(employee, OK);
    }
}
