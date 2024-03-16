package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.CustomerRepository;
import jadineria.jardineraDelEden.persistence.Customer;
import jadineria.jardineraDelEden.persistence.dtos.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ServiceInterface<CustomerDTO>{
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<CustomerDTO> getAll() {
        return customerRepository.findAll().stream()
                .map(Customer::toDTO)
                .toList();
    }

    public List<CustomerDTO> getCustomersDoNotPayAnyOrders(){
        return customerRepository.getCustomersDoNotPayAnyOrders().stream()
                .map(Customer::toDTO)
                .toList();
    }

    public List<CustomerDTO> findCustomersWithOrdersButNoPayments(){
        return customerRepository.findCustomersWithOrdersButNoPayments().stream()
                .map(Customer::toDTO)
                .toList();
    }

    public List<Object[]> countCustomersByCountry(){
        return customerRepository.countCustomersByCountry().stream()
                .toList();
    }

    public Long countCustomer(){
        return customerRepository.countCustomer();
    }

    public Long countCustomersByCityMadrid(){
        return customerRepository.countCustomersByCityMadrid();
    }

    public List<Object[]> countCustomersByCityStartingWithM(){
        return customerRepository.countCustomersByCityStartingWithM();
    }

    public Long countCustomersWithNoSalesRepresentative(){
        return customerRepository.countCustomersWithNoSalesRepresentative();
    }

    public List<Object[]> findMinMaxPaymentDatesByCustomer(){
        return customerRepository.findMinMaxPaymentDatesByCustomer();
    }
}
