package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.EmployeeRepository;
import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.Employee;
import jadineria.jardineraDelEden.persistence.dtos.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements ServiceInterface<EmployeeDTO>{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<EmployeeDTO> getAll() {
        return employeeRepository.findAll().stream()
                .map(Employee::toDTO)
                .toList();
    }
     // 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
     public List<Object[]> findEmployeesByBossId7() {
        return employeeRepository.findEmployeesByBossId7();
    }

    // 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
    public List<Object[]> findBossOfCompany() {
        return employeeRepository.findBossOfCompany();
    }

    // 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
    public List<Object[]> findEmployeesNotSalesRepresentatives() {
        return employeeRepository.findEmployeesNotSalesRepresentatives();
    }
    // 24
    public List<Object[]> findEmployeeAndBossNames() {
        return employeeRepository.findEmployeeAndBossNames();
    }
    //25
    public List<Object[]> findAllEmployeesWithBossAndGrandBoss() {
        return employeeRepository.findAllEmployeesWithBossAndGrandBoss();
    }
}