package co.com.k4soft.empleado.dao;

import co.com.k4soft.empleado.model.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
