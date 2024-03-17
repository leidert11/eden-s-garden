package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.OrderDetailRepository;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.dtos.OrderDetailDTO;
import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements ServiceInterface<OrderDetailDTO>{

    private final OrderDetailRepository orderDetailRepository;

    @Autowired
    public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }


    @Override
    public List<OrderDetailDTO> getAll() {
        return orderDetailRepository.findAll().stream()
                .map(OrderDetail::toDTO)
                .toList();
    }

    public List<Object> countDistinctProductsByOrder(){
        return orderDetailRepository.countDistinctProductsByOrder();
    }

    public List<Object[]> sumQuantityByOrder(){
        return orderDetailRepository.sumQuantityByOrder();
    }

    public List<Object[]> findTop20ProductsByTotalSold(){
        return orderDetailRepository.findTop20ProductsByTotalSold();
    }

    public List<Object[]> calculateInvoiceTotals(){
        return orderDetailRepository.calculateInvoiceTotals();
    }

    public List<Object[]> calculateProductInvoiceTotals(){
        return orderDetailRepository.calculateProductInvoiceTotals();
    }

    public List<Object[]> calculateTotalByProductStartingWithOR(){
        return orderDetailRepository.calculateTotalByProductStartingWithOR();
    }

    public List<Object[]> calculateTotalByProduct(){
        return orderDetailRepository.calculateTotalByProduct();
    }
}

