package employer.management.service;

import employer.management.model.Employee;

public interface EmployeeService {
    
    Employee saveEmployee(Employee employee);
    Iterable<Employee> getEmployee();
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
