package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.dtos.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//     @Query("")
//    public List<> get();

    @Query("SELECT c FROM Customer c LEFT JOIN c.payments p LEFT JOIN c.orders o WHERE p IS NULL OR o IS NULL")
    public List<Customer> getCustomersDoNotPayAnyOrders();

    @Query("SELECT DISTINCT c FROM Customer c LEFT JOIN c.orders o LEFT JOIN c.payments p WHERE o.customer.customerCode IS NOT NULL AND p.customer.customerCode IS NULL")
    public List<Customer> findCustomersWithOrdersButNoPayments();

    @Query("SELECT c.country, COUNT(c) FROM Customer c GROUP BY c.country")
    public List<Object[]> countCustomersByCountry();

    @Query("SELECT COUNT(c) FROM Customer c")
    public Long countCustomer();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.city = 'Madrid'")
    public Long countCustomersByCityMadrid();

    @Query("SELECT c.city, COUNT(c) FROM Customer c WHERE c.city LIKE 'M%' GROUP BY c.city")
    public List<Object[]> countCustomersByCityStartingWithM();

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.repSales IS NULL")
    public Long countCustomersWithNoSalesRepresentative();

    @Query("SELECT c.customerName, MIN(p.paymentDate), MAX(p.paymentDate) FROM Customer c JOIN c.payments p GROUP BY c.customerName")
    public List<Object[]> findMinMaxPaymentDatesByCustomer();
}
