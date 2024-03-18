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
    public List<EmployeeDTO> getAllCustomers() {
        return employeeService.getAll();
    }
     // 3.
     @GetMapping("/employees-by-boss-id-7")
     public List<Object[]> getEmployeesByBossId7() {
         return employeeService.findEmployeesByBossId7();
     }
 
     // 4.
     @GetMapping("/boss-of-company")
     public List<Object[]> getBossOfCompany() {
         return employeeService.findBossOfCompany();
     }
 
     // 5.
     @GetMapping("/employees-not-sales-representatives")
     public List<Object[]> getEmployeesNotSalesRepresentatives() {
         return employeeService.findEmployeesNotSalesRepresentatives();
     }
    // 24
     @GetMapping("/employee-and-boss-names")
    public List<Object[]> getEmployeeAndBossNames() {
        return employeeService.findEmployeeAndBossNames();
    }
    //25
    @GetMapping("/with-boss-and-grandboss")
    public List<Object[]> getAllEmployeesWithBossAndGrandBoss() {
        return employeeService.findAllEmployeesWithBossAndGrandBoss();
    }

}
