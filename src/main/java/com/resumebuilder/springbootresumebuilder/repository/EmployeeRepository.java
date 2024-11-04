package com.resumebuilder.springbootresumebuilder.repository;

import com.resumebuilder.springbootresumebuilder.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
