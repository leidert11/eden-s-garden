package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  // 6. Devuelve un listado con el nombre de todos los clientes españoles.
  @Query("SELECT c.customerName FROM Customer c WHERE c.country = 'Spain'")
  List<String> findSpanishCustomers();

  // Consulta 16
  @Query("SELECT c FROM Customer c JOIN c.repSales e WHERE c.city = 'Madrid' AND (e.employeeCode = 11 OR e.employeeCode = 30)")
  List<Customer> findCustomersInMadridWithSalesRep11Or30();

  // Consulta 17
  @Query("SELECT c.customerName, e.name, e.lastName1 FROM Customer c JOIN c.repSales e")
  List<Object[]> findCustomerNameAndSalesRepName();

  // Consulta 18
  @Query("SELECT c.customerName, e.name, e.lastName1 FROM Customer c JOIN c.repSales e WHERE EXISTS (SELECT p FROM Payment p WHERE p.customer = c)")
  List<Object[]> findCustomersWithPaymentsAndSalesRep();

  // Consulta 19
  @Query("SELECT c.customerName, e.name, e.lastName1 FROM Customer c JOIN c.repSales e WHERE NOT EXISTS (SELECT p FROM Payment p WHERE p.customer = c)")
  List<Object[]> findCustomersWithoutPaymentsAndSalesRep();

  // Consulta 20
  @Query("SELECT c.customerName, e.name, e.lastName1, o.city FROM Customer c JOIN c.repSales e JOIN e.office o WHERE EXISTS (SELECT p FROM Payment p WHERE p.customer = c)")
  List<Object[]> findCustomersWithPaymentsAndSalesRepWithOfficeCity();

  // 21
  @Query("SELECT c.customerName, e.name, o.city FROM Customer c " +
      "LEFT JOIN c.repSales e " +
      "LEFT JOIN e.office o " +
      "WHERE c.customerCode NOT IN (SELECT DISTINCT p.customer.customerCode FROM Payment p)")
  List<Object[]> findCustomersWithoutPayments();

  // 23
  @Query("SELECT c.customerName, e.name, o.city FROM Customer c " +
           "JOIN c.repSales e " +
           "JOIN e.office o")
  List<Object[]> findDistinctCustomerRepresentativeOffice();

  // 27
  // @Query("SELECT DISTINCT c.customerName, gp.gama " +
  //          "FROM Cliente c " +
  //          "JOIN c.orders o " +
  //          "JOIN o.orderDetails od " +
  //          "JOIN od.product p " +
  //          "JOIN p.gamaProduct gp")
  //   List<Object[]> findCustomerGamas();

  // @Query("SELECT c FROM Customer c LEFT JOIN c.payments p WHERE p.customer IS NULL")
  // List<Customer> findCustomersWithNoPayments();

  // // 29
  // @Query("SELECT c FROM Customer c LEFT JOIN c.orders p WHERE p.customer IS NULL")
  // List<Customer> findCustomersWithNoOrders();
}
