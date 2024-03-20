package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.OrderServiceImpl;
import jadineria.jardineraDelEden.persistence.Order;
import jadineria.jardineraDelEden.persistence.dtos.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
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
     // 7.
     @GetMapping("/distinct-order-status")
     public List<String> getDistinctOrderStatus() {return orderService.findDistinctOrderStatus();}

     // 9.
     @GetMapping("/delayed-orders")
     public List<Object[]> getDelayedOrders() {
         return orderService.findDelayedOrders();
     }
        // Endpoint para la consulta 10
        @GetMapping("/late-delivery")
        public List<Object[]> findOrdersWithLateDelivery() {
            return orderService.findOrdersWithLateDelivery();
        }

    // Endpoint para la consulta 11
    @GetMapping("/rejected-2009")
    public ResponseEntity<List<Order>> findRejectedOrdersIn2009() {
        return ResponseEntity.ok(orderService.findRejectedOrdersIn2009());
    }

    // Endpoint para la consulta 12
    @GetMapping("/delivered-in-january")
    public ResponseEntity<List<jadineria.jardineraDelEden.persistence.Order>> findOrdersDeliveredInJanuary() {
        return ResponseEntity.ok(orderService.findOrdersDeliveredInJanuary());
    }
 

    @GetMapping("/count-order-by-status")
    public List<Object[]> countOrderByStatus(){
        return orderService.countOrderByStatus();
    }
}
