package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.CustomerServiceImpl;
import jadineria.jardineraDelEden.persistence.dtos.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAll();
    }


    @GetMapping("/customers-do-not-pay-any-orders")
    public List<CustomerDTO> customersDoNotPayAnyOrders(){
        return customerService.getCustomersDoNotPayAnyOrders();
    }

    @GetMapping("/find-customers-with-orders-but-no-payments")
    public List<CustomerDTO> findCustomersWithOrdersButNoPayments(){
        return customerService.findCustomersWithOrdersButNoPayments();
    }

    @GetMapping("/count-customers-by-country")
    public List<Object[]> countCustomersByCountry(){
        return customerService.countCustomersByCountry();
    }

    @GetMapping("/count-customer")
    public Long countCustomer(){
        return customerService.countCustomer();
    }

    @GetMapping("/count-customers-by-city-madrid")
    public Long countCustomersByCityMadrid(){
        return customerService.countCustomersByCityMadrid();
    }

    @GetMapping("/count-customers-by-city-starting-with-m")
    public List<Object[]> countCustomersByCityStartingWithM(){
        return customerService.countCustomersByCityStartingWithM();
    }

    @GetMapping("/count-customers-with-no-sales-representative")
    public Long countCustomersWithNoSalesRepresentative(){
        return customerService.countCustomersWithNoSalesRepresentative();
    }

    @GetMapping("/find-min-max-payment-dates-by-customer")
    public List<Object[]> findMinMaxPaymentDatesByCustomer(){
        return customerService.findMinMaxPaymentDatesByCustomer();
    }
}
