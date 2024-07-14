package org.example;

import lombok.AllArgsConstructor;
import org.example.employee.EmployeeData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@AllArgsConstructor
@SpringBootApplication
public class App {
    private final EmployeeData employeeData;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationStart() {
        employeeData.populate();
    }
}