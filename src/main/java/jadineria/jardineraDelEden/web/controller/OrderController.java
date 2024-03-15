package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.OrderServiceImpl;
import jadineria.jardineraDelEden.persistence.dtos.OrderDTO;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-service")
@CrossOrigin("*")
public class OrderController {

    private final OrderServiceImpl orderService;

    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderDTO> getAllOrder() {
        return orderService.getAll();
    }
}
