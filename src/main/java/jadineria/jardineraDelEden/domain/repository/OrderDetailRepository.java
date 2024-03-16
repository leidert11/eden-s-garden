package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetail;
import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
//     @Query("")
//    public List<> get();

    @Query("SELECT od.id.orderCode, COUNT(DISTINCT od.id.productCode) FROM OrderDetail od GROUP BY od.id.orderCode")
    public List<Object> countDistinctProductsByOrder();
}
