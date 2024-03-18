package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
     // 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos.
    @Query("SELECT DISTINCT p.customer.customerCode FROM Payment p WHERE YEAR(p.paymentDate) = 2008")
    List<Integer> findCustomerCodesWithPaymentsIn2008();

    // Consulta 13
    @Query("SELECT p FROM Payment p WHERE p.wayToPay = 'Paypal' AND FUNCTION('YEAR', p.paymentDate) = 2008 ORDER BY p.total DESC")
List<Payment> findPaypalPaymentsIn2008OrderByTotalDesc();

    // Consulta 14
    @Query("SELECT DISTINCT p.wayToPay FROM Payment p")
List<String> findDistinctPaymentMethods();
}
