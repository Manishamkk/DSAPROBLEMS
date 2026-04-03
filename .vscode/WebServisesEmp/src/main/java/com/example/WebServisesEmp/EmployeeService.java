package com.example.WebServisesEmp;

import java.util.List;

public interface EmployeeService {

    Employee saveEmp(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long empId);
    void deleteById(Long empId);
    Employee updateEmp(Long empId,Employee employee);

}