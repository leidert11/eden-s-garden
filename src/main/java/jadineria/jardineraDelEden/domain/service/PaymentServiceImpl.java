package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.PaymentRepository;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.Payment;
import jadineria.jardineraDelEden.persistence.dtos.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
    public List<Double> findPaypalPaymentsIn2008OrderByTotalDesc() {
        List<Double> payments = paymentRepository.findPaypalPaymentsTotalIn2008();
        Collections.sort(payments, Collections.reverseOrder());
        return payments;
    }

    // Consulta 14 - Formas de pago distintas en la tabla de pagos
    public List<String> findDistinctPaymentMethods() {
        return paymentRepository.findDistinctPaymentMethods();
    }

    public Optional<Double> findAveragePaymentTotalForYear2009(){
        return paymentRepository.findAveragePaymentTotalForYear2009();
    }

    public List<Object[]> getTotalPaymentsByYear(){
        return paymentRepository.getTotalPaymentsByYear();
    }
}
