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
@RequestMapping("/office")
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

    @GetMapping("/ofices-not-employees-have-client-with-gama-frutales")
    public List<String> getOfficesNotEmployeesHaveClientWithGamaFrutales(){
        return officeService.getOfficesNotEmployeesHaveClientWithGamaFrutales();
    }

}
