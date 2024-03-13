package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.EmployeeRepository;
import jadineria.jardineraDelEden.persistence.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements ServiceInterface<Employee>{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<Employee> getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> save(Employee employee) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> update(Long id, Employee employee) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}