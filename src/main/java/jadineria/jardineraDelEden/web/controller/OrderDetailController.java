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
@RequestMapping("/api/order-detail")
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

     @GetMapping("/sum-quantity-by-order")
    public List<Object[]> sumQuantityByOrder(){
        return orderDetailService.sumQuantityByOrder();
     }

     @GetMapping("/find-top-20-products-by-total-sold")
    public List<Object[]> findTop20ProductsByTotalSold(){
        return orderDetailService.findTop20ProductsByTotalSold();
     }

     @GetMapping("/calculate-invoice-totals")
    public List<Object[]> calculateInvoiceTotals(){
        return orderDetailService.calculateInvoiceTotals();
    }

    @GetMapping("/calculate-product-invoice-totals")
    public List<Object[]> calculateProductInvoiceTotals(){
        return orderDetailService.calculateProductInvoiceTotals();
    }

    @GetMapping("/calculate-total-by-product-starting-with-o-r")
    public List<Object[]> calculateTotalByProductStartingWithOR(){
        return orderDetailService.calculateTotalByProductStartingWithOR();
    }

    @GetMapping("/calculate-total-by-product")
    public List<Object[]> calculateTotalByProduct(){
        return orderDetailService.calculateTotalByProduct();
    }
}
