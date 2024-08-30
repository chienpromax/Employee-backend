package employer.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employer.management.model.Employee;
import employer.management.repository.EmployeeRepository;
import employer.management.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

}
