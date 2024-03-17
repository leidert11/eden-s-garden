package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    // Cuántos pedidos hay en cada estado. Ordena el resultado de forma descendente por el número de pedidos.
    @Query("SELECT o.status, COUNT(o) FROM Order o GROUP BY o.status ORDER BY COUNT(o) DESC")
    public List<Object[]> countOrderByStatus();


}
