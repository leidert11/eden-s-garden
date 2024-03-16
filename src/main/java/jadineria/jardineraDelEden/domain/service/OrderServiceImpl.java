package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.OrderRepository;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.Order;
import jadineria.jardineraDelEden.persistence.dtos.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Object[]> countOrderByStatus(){
        return orderRepository.countOrderByStatus();
    }
}
