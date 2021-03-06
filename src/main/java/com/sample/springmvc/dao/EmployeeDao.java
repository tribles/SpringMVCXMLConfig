package com.sample.springmvc.dao;

import java.util.List;

import com.sample.springmvc.domain.Employee;

public interface EmployeeDao {
	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
}
