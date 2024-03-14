package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.EmployeeServiceImpl;
import jadineria.jardineraDelEden.domain.service.GamaProductServiceImpl;
import jadineria.jardineraDelEden.persistence.GamaProduct;
import jadineria.jardineraDelEden.persistence.dtos.EmployeeDTO;
import jadineria.jardineraDelEden.persistence.dtos.GamaProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class GamaProductController {

    private final GamaProductServiceImpl gamaProductService;

    @Autowired
    public GamaProductController(GamaProductServiceImpl gamaProductService) {
        this.gamaProductService = gamaProductService;
    }

    @GetMapping
    public List<GamaProductDTO> getAllGamaProduct() {
        return gamaProductService.getAll();
    }
}
