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
}
