package jadineria.jardineraDelEden.domain.service;


import jadineria.jardineraDelEden.domain.repository.OfficeRepository;
import jadineria.jardineraDelEden.persistence.Employee;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.dtos.OfficeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImpl implements ServiceInterface<OfficeDTO>{
    private final OfficeRepository officeRepository;

    @Autowired
    public OfficeServiceImpl(OfficeRepository officeRepository) {
        this.officeRepository = officeRepository;
    }


    @Override
    public List<OfficeDTO> getAll() {
        return officeRepository.findAll().stream()
                .map(Office::toDTO)
                .toList();
    }
}
