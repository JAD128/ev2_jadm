package com.techsolution.tech_solution_jadm.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmployeeRequest {

    @NotBlank(message = "name is required")
    @Size(max = 120, message = "name must be <= 120 chars")
    private String name;
    @Size(max = 120, message = "position must be <= 120 chars")
    private String position;
    private Double salary;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
