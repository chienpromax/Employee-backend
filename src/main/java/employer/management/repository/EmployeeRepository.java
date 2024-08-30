package employer.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employer.management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    
}
