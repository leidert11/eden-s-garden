package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.PaymentServiceImpl;
import jadineria.jardineraDelEden.persistence.Payment;
import jadineria.jardineraDelEden.persistence.dtos.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payment")
@CrossOrigin("*")
public class PaymentController {
    private final PaymentServiceImpl paymentService;

    @Autowired
    public PaymentController(PaymentServiceImpl paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<PaymentDTO> getAllPayment() {
        return paymentService.getAll();
    }

    @GetMapping("/find-average-payment-total-for-year")
    public Optional<Double> findAveragePaymentTotalForYear2009(){
        return paymentService.findAveragePaymentTotalForYear2009();
    }

    @GetMapping("/get-total-payments-by-year")
    public List<Object[]> getTotalPaymentsByYear(){
        return paymentService.getTotalPaymentsByYear();
    }
}
