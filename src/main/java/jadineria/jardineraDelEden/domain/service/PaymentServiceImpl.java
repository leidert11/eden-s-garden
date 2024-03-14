package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.PaymentRepository;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.Payment;
import jadineria.jardineraDelEden.persistence.dtos.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements ServiceInterface<PaymentDTO>{

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    @Override
    public List<PaymentDTO> getAll() {
        return paymentRepository.findAll().stream()
                .map(Payment::toDTO)
                .toList();
    }
}
