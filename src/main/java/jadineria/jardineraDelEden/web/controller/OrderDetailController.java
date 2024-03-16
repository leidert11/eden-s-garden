package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.repository.OrderDetailRepository;
import jadineria.jardineraDelEden.domain.service.OrderDetailServiceImpl;
import jadineria.jardineraDelEden.persistence.dtos.OrderDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order-detail")
@CrossOrigin("*")
public class OrderDetailController {

    private final OrderDetailServiceImpl orderDetailService;

    @Autowired
    public OrderDetailController(OrderDetailServiceImpl orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    @GetMapping
    public List<OrderDetailDTO> getAllOrderDetail() {
        return orderDetailService.getAll();
    }

    @GetMapping("/count-distinct-products-by-order")
    public List<Object> countDistinctProductsByOrder(){
        return orderDetailService.countDistinctProductsByOrder();
    }
}
