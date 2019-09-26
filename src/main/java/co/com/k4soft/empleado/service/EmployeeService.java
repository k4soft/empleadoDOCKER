package co.com.k4soft.empleado.service;

import co.com.k4soft.empleado.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
