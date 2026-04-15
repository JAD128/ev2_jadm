package com.techsolution.tech_solution_jadm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techsolution.tech_solution_jadm.dto.EmployeeRequest;
import com.techsolution.tech_solution_jadm.dto.EmployeeResponse;
import com.techsolution.tech_solution_jadm.entity.Employee;
import com.techsolution.tech_solution_jadm.repository.EmployeeRepository;
import com.techsolution.tech_solution_jadm.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    private EmployeeResponse toResponse(Employee employee) {
        EmployeeResponse response = new EmployeeResponse();

        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setPosition(employee.getPosition());
        response.setSalary(employee.getSalary());

        return response;
    }

    @Override
    public EmployeeResponse create(EmployeeRequest request) {

        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setPosition(request.getPosition());
        employee.setSalary(request.getSalary());

        Employee saved = repository.save(employee);

        return toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponse> list() {
        return repository.findAll().stream().map(this::toResponse).toList();
    }
}