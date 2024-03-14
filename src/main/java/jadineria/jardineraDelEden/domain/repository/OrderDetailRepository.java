package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetail;
import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}
