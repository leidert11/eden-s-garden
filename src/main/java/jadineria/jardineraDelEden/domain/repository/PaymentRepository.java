package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
}
