package com.techsolution.tech_solution_jadm.dto;

public class EmployeeResponse {

    private Long id;
    private String name;
    private String position;
    private Double salary;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Long id) {
        this.id = id;
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

