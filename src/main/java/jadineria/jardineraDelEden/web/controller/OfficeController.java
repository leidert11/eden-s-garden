package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.OfficeServiceImpl;
import jadineria.jardineraDelEden.persistence.dtos.OfficeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/office")
@CrossOrigin("*")
public class OfficeController {

    private final OfficeServiceImpl officeService;

    @Autowired
    public OfficeController(OfficeServiceImpl officeService) {
        this.officeService = officeService;
    }

    @GetMapping
    public List<OfficeDTO> getAllOffice() {
        return officeService.getAll();
    }
        // 1.
        @GetMapping("/office-code-and-city")
        public List<Object[]> getOfficeCodeAndCity() {
            return officeService.findOfficeCodeAndCity();
        }
    
        // 2.
        @GetMapping("/city-and-phone-in-spain")
        public List<Object[]> getCityAndPhoneInSpain() {
            return officeService.findCityAndPhoneInSpain();
        }
        // 20 
        @GetMapping("/get-customers-with-payments-and-their-sales-reps-and-office-city")
        public List<Object[]> getCustomersWithPaymentsAndTheirSalesRepsAndOfficeCity() {
            return officeService.findCustomersWithPaymentsAndTheirSalesRepAndOfficeCity();
        }
        // 22
        @GetMapping("/fuenlabrada-office-addresses")
        public List<String> getOfficeAddressesInFuenlabrada() {
        return officeService.findOfficeAddressesInFuenlabrada();
    }

    @GetMapping("/ofices-not-employees-have-client-with-gama-frutales")
    public List<String> getOfficesNotEmployeesHaveClientWithGamaFrutales(){
        return officeService.getOfficesNotEmployeesHaveClientWithGamaFrutales();
    }

}
