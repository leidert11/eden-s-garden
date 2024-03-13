package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
