package sit.int204.classicmodelsservicetry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelsservicetry.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
