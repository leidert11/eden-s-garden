package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.dtos.CustomerDTO;
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

    // Clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
    @Query("SELECT c FROM Customer c LEFT JOIN c.payments p LEFT JOIN c.orders o WHERE p IS NULL OR o IS NULL")
    public List<Customer> getCustomersDoNotPayAnyOrders();

    // Clientes que han realizado algún pedido pero no han realizado ningún pago.
    @Query("SELECT DISTINCT c FROM Customer c LEFT JOIN c.orders o LEFT JOIN c.payments p WHERE o.customer.customerCode IS NOT NULL AND p.customer.customerCode IS NULL")
    public List<Customer> findCustomersWithOrdersButNoPayments();


    // Cuántos clientes tiene cada país.
    @Query("SELECT c.country, COUNT(c) FROM Customer c GROUP BY c.country")
    public List<Object[]> countCustomersByCountry();

    // Número de clientes que tiene la empresa.
    @Query("SELECT COUNT(c) FROM Customer c")
    public Long countCustomer();

    // Cuántos clientes existen con domicilio en la ciudad de Madrid.
    @Query("SELECT COUNT(c) FROM Customer c WHERE c.city = 'Madrid'")
    public Long countCustomersByCityMadrid();

    // Cuántos clientes tiene cada una de las ciudades que empiezan por M.
    @Query("SELECT c.city, COUNT(c) FROM Customer c WHERE c.city LIKE 'M%' GROUP BY c.city")
    public List<Object[]> countCustomersByCityStartingWithM();

    // Número de clientes que no tiene asignado representante de ventas.
    @Query("SELECT COUNT(c) FROM Customer c WHERE c.repSales IS NULL")
    public Long countCustomersWithNoSalesRepresentative();

    // Fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.
    @Query("SELECT c.customerName, MIN(p.paymentDate), MAX(p.paymentDate) FROM Customer c JOIN c.payments p GROUP BY c.customerName")
    public List<Object[]> findMinMaxPaymentDatesByCustomer();
}
