package com.techsolution.tech_solution_jadm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techsolution.tech_solution_jadm.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
