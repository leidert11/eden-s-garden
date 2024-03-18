package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
   // 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
   @Query("SELECT e.name, e.lastName1, e.lastName2, e.email FROM Employee e WHERE e.boss.employeeCode = 7")
   List<Object[]> findEmployeesByBossId7();

   // 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
   @Query("SELECT e.rol, e.name, e.lastName1, e.lastName2, e.email FROM Employee e WHERE e.boss IS NULL")
   List<Object[]> findBossOfCompany();

   // 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
   @Query("SELECT e.name, e.lastName1, e.rol FROM Employee e WHERE e.rol <> 'Representante de ventas'")
   List<Object[]> findEmployeesNotSalesRepresentatives();
   
   // 22
   @Query("SELECT e.name AS nombre_empleado, j.name AS nombre_jefe FROM Employee e LEFT JOIN Employee j ON e.boss.employeeCode = j.employeeCode")
   List<Object[]> findEmployeeAndBossNames();

   //25
    @Query("SELECT e.name AS nombre_empleado, " +
           "j.name AS nombre_jefe, " +
           "jj.name AS nombre_jefe_del_jefe " +
           "FROM Employee e " +
           "LEFT JOIN e.boss j " +
           "LEFT JOIN j.boss jj")
    List<Object[]> findAllEmployeesWithBossAndGrandBoss();

    // Empleados que no tienen una oficina asociada.
    @Query("SELECT e FROM Employee e LEFT JOIN e.office o WHERE o IS NULL")
   public List<Employee> getEmployeesNotAssociatedOffice();

    // Empleados que no tienen un cliente asociado.
    @Query("SELECT e FROM Employee e LEFT JOIN e.customers o where o IS NULL")
   public List<Employee> getEmployeesDoNotHaveClients();

    // Empleados que no tienen un cliente asociado junto con los datos de la oficina donde trabajan.
    @Query("SELECT e, a FROM Employee e LEFT JOIN e.customers o LEFT JOIN e.office a WHERE o IS NULL")
    public List<Employee> getNonClientOfficeEmployeesWork();

    // Empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
    @Query("SELECT e FROM Employee e LEFT JOIN e.office o LEFT JOIN e.customers a WHERE o IS NULL OR a IS NULL")
    public List<Employee> getEmployeesNotAssociatedOfficeAndNotClient();

    // empleados que no tienen clientes asociados y el nombre de su jefe asociado.
    @Query("SELECT e1, e2.name AS bossName FROM Employee e1 LEFT JOIN e1.customers c LEFT JOIN e1.boss e2 WHERE c.repSales IS NULL")
    public List<Employee> findEmployeesWithoutCustomers();

    // Cuántos empleados hay en la compañía
    @Query("SELECT COUNT(e) FROM Employee e")
    public Long countEmployees();

    // Nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
    @Query("SELECT e.name, COUNT(c.customerCode) FROM Employee e LEFT JOIN e.customers c GROUP BY e.name")
    public List<Object[]> countCustomersByEmployee();
    
}
