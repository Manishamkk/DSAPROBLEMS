package com.example.WebServisesEmp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

@Autowired
private EmployeeService employeeService;

@PostMapping("/saveEmp")
public Employee createEmployee(@RequestBody Employee employee) {
    return employeeService.saveEmp(employee);
}
@GetMapping("/getAllEmp")
public List<Employee> getAllEmployees(){
    return employeeService.getAllEmployees();
}
@GetMapping("/getEmp/{empId}")
public Employee getEmployeeById(@PathVariable Long empId) {
	return employeeService.getEmployeeById(empId);
}
@DeleteMapping("/empDelete/{empId}")
public String deleteById(@PathVariable Long empId) {
	employeeService.deleteById(empId);
    return "one record is affected";
}

@PutMapping("/updateEmp/{empId}")
public Employee updateEmployee(@PathVariable Long empId ,@RequestBody Employee employee) {
	return employeeService.updateEmp(empId, employee);


}
}