package co.com.k4soft.empleado.service.impl;

import co.com.k4soft.empleado.dao.EmployeeDao;
import co.com.k4soft.empleado.model.Employee;
import co.com.k4soft.empleado.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeDao.getAllEmployees();
        return employees;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);

    }
}
