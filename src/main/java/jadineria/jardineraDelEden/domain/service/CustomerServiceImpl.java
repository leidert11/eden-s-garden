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
     // 6. Devuelve un listado con el nombre de todos los clientes españoles.
     public List<String> findSpanishCustomers() {
        return customerRepository.findSpanishCustomers();
    }

    // Método para la consulta 16
    public List<Customer> findCustomersInMadridWithSalesRepCode11Or30() {
        return customerRepository.findCustomersInMadridWithSalesRep11Or30();
    }
    
     // 17. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
     public List<Object[]> findCustomerNameAndSalesRepName() {
        return customerRepository.findCustomerNameAndSalesRepName();
    }

    // 18. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
    public List<Object[]> findCustomersWithPaymentsAndSalesRep() {
        return customerRepository.findCustomersWithPaymentsAndSalesRep();
    }
    
    // 19. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
    public List<Object[]> findCustomersWithoutPaymentsAndSalesRep() {
        return customerRepository.findCustomersWithoutPaymentsAndSalesRep();
    }
    
    // 20. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
    public List<Object[]> findCustomersWithPaymentsAndSalesRepWithOfficeCity() {
        return customerRepository.findCustomersWithPaymentsAndSalesRepWithOfficeCity();
    }

    // Consulta 21 - Clientes sin pagos realizados
    public List<Object[]> findCustomersWithoutPayments() {
        return customerRepository.findCustomersWithoutPayments();
    }

    // Consulta 23 - Clientes distintos con representante de ventas y oficina
    public List<Object[]> findDistinctCustomerRepresentativeOffice() {
        return customerRepository.findDistinctCustomerRepresentativeOffice();
    }

    // Consulta 27 - Clientes con gamas de productos
    // public List<Object[]> findCustomerGamas() {
    //     return customerRepository.findCustomerGamas();
    // }

    // // Consulta 28 - Clientes sin pagos registrados
    // public List<Customer> findCustomersWithNoPayments() {
    //     return customerRepository.findCustomersWithNoPayments();
    // }

    // // Consulta 29 - Clientes sin órdenes registradas
    // public List<Customer> findCustomersWithNoOrders() {
    //     return customerRepository.findCustomersWithNoOrders();
    // }

}
