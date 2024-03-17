package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

    // Pago medio en 2009.
    @Query("SELECT AVG(p.total) FROM Payment p WHERE FUNCTION('YEAR', p.paymentDate) = 2009")
    public Optional<Double> findAveragePaymentTotalForYear2009();

    // Suma total de todos los pagos que se realizaron para cada uno de los años que aparecen en la tabla pagos.
    @Query("SELECT FUNCTION('YEAR', p.paymentDate) AS año, SUM(p.total) FROM Payment p GROUP BY FUNCTION('YEAR', p.paymentDate)")
    List<Object[]> getTotalPaymentsByYear();

}
