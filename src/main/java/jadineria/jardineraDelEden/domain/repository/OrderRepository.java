package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // 7. Devuelve un listado con los distintos estados por los que puede pasar un
    // pedido.
    @Query("SELECT DISTINCT o.status FROM Order o")
    List<String> findDistinctOrderStatus();

    // 9. Devuelve un listado con el código de pedido, código de cliente, fecha
    // esperada y fecha de entrega de los pedidos que no han sido entregados a
    // tiempo.
    @Query("SELECT o.orderCode, o.customer.customerCode, o.expectedDate, o.deliverDate FROM Order o WHERE o.deliverDate > o.expectedDate")
    List<Object[]> findDelayedOrders();

    // Consulta 10

    @Query("SELECT o.orderCode, o.customer.customerCode, o.expectedDate, o.deliverDate FROM Order o " +
            "WHERE o.deliverDate IS NOT NULL AND SUBDATE(o.deliverDate, 2) < o.expectedDate")
    List<Object[]> findOrdersWithLateDelivery();

    // Consulta 11
    @Query("SELECT o.orderCode, o.orderDate, o.expectedDate, o.deliverDate, o.status, o.comments, o.customer.customerName FROM Order o WHERE o.status = 'Rejected' AND FUNCTION('YEAR', o.orderDate) = 2009")
    List<Object[]> findRejectedOrdersIn2009();


    // Consulta 12
    @Query("SELECT o.orderCode, o.orderDate, o.expectedDate, o.deliverDate, o.status, o.comments, o.customer.customerName FROM Order o WHERE MONTH(o.deliverDate) = 1")
    List<Object[]> findOrdersDeliveredInJanuary();

    // Cuántos pedidos hay en cada estado. Ordena el resultado de forma descendente
    // por el número de pedidos.
    @Query("SELECT o.status, COUNT(o) FROM Order o GROUP BY o.status ORDER BY COUNT(o) DESC")
    public List<Object[]> countOrderByStatus();

}
