package com.example.WebServisesEmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
@Service
public class ServiceImpl implements EmployeeService {

@Autowired
private EmployeeRepository repository;

@Override
public Employee saveEmp(Employee employee) {
    return repository.save(employee);
}


@Override
public List<Employee> getAllEmployees() {
    return repository.findAll();
}


@Override
public Employee getEmployeeById(Long empId) {
	// TODO Auto-generated method stub
	return repository.getById(empId);
}


@Override
public void deleteById(Long empId) {
	repository.deleteById(empId);
	
}


@Override
public Employee updateEmp(Long empId, Employee employee) {
	// TODO Auto-generated method stub
	Employee emp = repository.findById(empId).get();

    emp.setEmpName(employee.getEmpName());
    emp.setAdress(employee.getAdress());
    emp.setSalary(employee.getSalary());

    return repository.save(emp);
}

}