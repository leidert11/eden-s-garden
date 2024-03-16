package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
//     @Query("")
//    public List<> get();

    @Query("SELECT AVG(p.total) FROM Payment p WHERE FUNCTION('YEAR', p.paymentDate) = 2009")
    public Optional<Double> findAveragePaymentTotalForYear2009();


}
