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
     // 8.
     public List<Integer> findCustomerCodesWithPaymentsIn2008() {
        return paymentRepository.findCustomerCodesWithPaymentsIn2008();
    }
    // Consulta 13 - Pagos realizados en PayPal en el año 2008, ordenados por total descendente
    // @NamedQuery("paypalPaymentsIn2008OrderedByTotalDesc")
    public List<Payment> findPaypalPaymentsIn2008OrderByTotalDesc() {
        return paymentRepository.findPaypalPaymentsIn2008OrderByTotalDesc();
    }

    // Consulta 14 - Formas de pago distintas en la tabla de pagos
    // @NamedQuery("distinctPaymentMethods")
    public List<String> findDistinctPaymentMethods() {
        return paymentRepository.findDistinctPaymentMethods();
    }
}
