package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.EmployeeServiceImpl;
import jadineria.jardineraDelEden.persistence.dtos.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployee() {
        return employeeService.getAll();
    }
    
    @GetMapping("/employees-not-associated-office")
    public List<EmployeeDTO> getEmployeesNotAssociatedOffice(){
        return employeeService.getEmployeesNotAssociatedOffice();
    }

    @GetMapping("/employees-do-not-have-clients")
    public List<EmployeeDTO> getEmployeesDoNotHaveClients(){
        return employeeService.getEmployeesDoNotHaveClients();
    }

    @GetMapping("/non-client-office-employees-work")
    public List<EmployeeDTO> getNonClientOfficeEmployeesWork(){
        return employeeService.getNonClientOfficeEmployeesWork();
    }

     @GetMapping("/employees-not-associated-office-and-not-client")
    public List<EmployeeDTO> getEmployeesNotAssociatedOfficeAndNotClient (){
        return employeeService.getEmployeesNotAssociatedOfficeAndNotClient();
    }

    @GetMapping("/find-employees-without-customers")
    public List<EmployeeDTO> findEmployeesWithoutCustomers(){
        return employeeService.findEmployeesWithoutCustomers();
    }

    @GetMapping("/count-employees")
    public Long countEmployees(){
        return employeeService.countEmployees();
    }

    @GetMapping("/count-customers-by-employee")
    public List<Object[]> countCustomersByEmployee(){
        return employeeService.countCustomersByEmployee();
    }
}
