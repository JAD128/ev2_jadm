package com.techsolution.tech_solution_jadm.service;

import java.util.List;

import com.techsolution.tech_solution_jadm.dto.EmployeeRequest;
import com.techsolution.tech_solution_jadm.dto.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse create(EmployeeRequest request);

    List<EmployeeResponse> list();
}
