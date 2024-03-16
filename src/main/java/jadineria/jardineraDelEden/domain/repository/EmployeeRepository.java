package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
//     @Query("")
//    public List<> get();

//    SELECT * FROM empleado LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE oficina.codigo_oficina IS NULL;
    @Query("SELECT e FROM Employee e LEFT JOIN e.office o WHERE o IS NULL")
   public List<Employee> getEmployeesNotAssociatedOffice();

//    SELECT * FROM empleado LEFT JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.codigo_empleado_rep_ventas IS NULL;
    @Query("SELECT e FROM Employee e LEFT JOIN e.customers o where o IS NULL")
   public List<Employee> getEmployeesDoNotHaveClients();
//    SELECT empleado.*, oficina.* FROM empleado LEFT JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE cliente.codigo_empleado_rep_ventas IS NULL;
     @Query("SELECT e, a FROM Employee e LEFT JOIN e.customers o LEFT JOIN e.office a WHERE o IS NULL")
    public List<Employee> getNonClientOfficeEmployeesWork();

//    SELECT * FROM empleado LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina LEFT JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE oficina.codigo_oficina IS NULL OR cliente.codigo_empleado_rep_ventas IS NULL;
     @Query("SELECT e FROM Employee e LEFT JOIN e.office o LEFT JOIN e.customers a WHERE o IS NULL OR a IS NULL")
    public List<Employee> getEmployeesNotAssociatedOfficeAndNotClient();

    @Query("SELECT e1, e2.name AS bossName FROM Employee e1 LEFT JOIN e1.customers c LEFT JOIN e1.boss e2 WHERE c.repSales IS NULL")
    public List<Employee> findEmployeesWithoutCustomers();

    @Query("SELECT COUNT(e) FROM Employee e")
    public Long countEmployees();

    @Query("SELECT e.name, COUNT(c.customerCode) FROM Employee e LEFT JOIN e.customers c GROUP BY e.name")
    public List<Object[]> countCustomersByEmployee();
    
}
