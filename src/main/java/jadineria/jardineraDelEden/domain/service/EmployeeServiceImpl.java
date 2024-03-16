package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.EmployeeRepository;
import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.Employee;
import jadineria.jardineraDelEden.persistence.dtos.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


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

    public List<EmployeeDTO> getEmployeesNotAssociatedOffice(){
        return employeeRepository.getEmployeesNotAssociatedOffice().stream()
                .map(Employee::toDTO)
                .toList();
    }

    public List<EmployeeDTO> getEmployeesDoNotHaveClients(){
        return employeeRepository.getEmployeesDoNotHaveClients().stream()
                .map(Employee::toDTO)
                .toList();
    }

    public List<EmployeeDTO> getNonClientOfficeEmployeesWork(){
        return employeeRepository.getNonClientOfficeEmployeesWork().stream()
                .map(Employee::toDTO)
                .toList();
    }

    public List<EmployeeDTO> getEmployeesNotAssociatedOfficeAndNotClient(){
        return employeeRepository.getEmployeesNotAssociatedOfficeAndNotClient().stream()
                .map(Employee::toDTO)
                .toList();
    }

    public List<EmployeeDTO> findEmployeesWithoutCustomers(){
        return employeeRepository.findEmployeesWithoutCustomers().stream()
                .map(Employee::toDTO)
                .toList();
    }

    public Long countEmployees(){
        return employeeRepository.countEmployees();
    }

    public List<Object[]> countCustomersByEmployee(){
        return employeeRepository.countCustomersByEmployee();
    }
}