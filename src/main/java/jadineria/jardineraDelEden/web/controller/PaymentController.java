package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.PaymentServiceImpl;
import jadineria.jardineraDelEden.persistence.Payment;
import jadineria.jardineraDelEden.persistence.dtos.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        // 8.
        @GetMapping("/customer-codes-with-payments-in-2008")
        public List<Integer> getCustomerCodesWithPaymentsIn2008() {
            return paymentService.findCustomerCodesWithPaymentsIn2008();
        }

     // Consulta 13 - Pagos realizados en PayPal en el año 2008, ordenados por total descendente
     @GetMapping("/paypal-payments-2008")
     // Obtiene los pagos realizados en PayPal en 2008, ordenados por total descendente
     public List<Payment> getPaypalPaymentsIn2008OrderByTotalDesc() {
         return paymentService.findPaypalPaymentsIn2008OrderByTotalDesc();
     }
 
     // Consulta 14 - Formas de pago distintas en la tabla de pagos
     @GetMapping("/distinct-payment-methods")
     // Obtiene las formas de pago distintas en la tabla de pagos
     public List<String> getDistinctPaymentMethods() {
         return paymentService.findDistinctPaymentMethods();
     }
}
