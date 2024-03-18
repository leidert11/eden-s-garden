package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.OrderRepository;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.Order;
import jadineria.jardineraDelEden.persistence.dtos.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class OrderServiceImpl implements ServiceInterface<OrderDTO>{

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream()
                .map(Order::toDTO)
                .toList();
    }
     // 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
     public List<String> findDistinctOrderStatus() {
        return orderRepository.findDistinctOrderStatus();
    }

    // 9.
    public List<Object[]> findDelayedOrders() {
        return orderRepository.findDelayedOrders();
    }

    // 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
    public List<Object[]> findOrdersWithLateDelivery() {
        return orderRepository.findOrdersWithLateDelivery();
    }
    // 11
    public List<Order> findRejectedOrdersIn2009() {
        return orderRepository.findRejectedOrdersIn2009();
    }
    // 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
    public List<Order> findOrdersDeliveredInJanuary() {
        return orderRepository.findOrdersDeliveredInJanuary();
    }
}
