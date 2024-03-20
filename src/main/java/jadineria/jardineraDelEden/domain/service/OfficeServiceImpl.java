package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.OfficeRepository;
import jadineria.jardineraDelEden.persistence.Employee;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.dtos.OfficeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImpl implements ServiceInterface<OfficeDTO> {
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

    // 1. Devuelve un listado con el código de oficina y la ciudad donde hay
    // oficinas.
    public List<Object[]> findOfficeCodeAndCity() {
        return officeRepository.findOfficeCodeAndCity();
    }

    // 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
    public List<Object[]> findCityAndPhoneInSpain() {
        return officeRepository.findCityAndPhoneInSpain();
    }

    // 20
    public List<Object[]> findCustomersWithPaymentsAndTheirSalesRepAndOfficeCity() {
        return officeRepository.findCustomersWithPaymentsAndTheirSalesRepAndOfficeCity();
    }

    // 22 Consulta para encontrar las direcciones de oficina en Fuenlabrada
    public List<String> findOfficeAddressesInFuenlabrada() {
        return officeRepository.findOfficeAddressesInFuenlabrada();
    }

    public List<String> getOfficesNotEmployeesHaveClientWithGamaFrutales() {
        return officeRepository.getOfficesNotEmployeesHaveClientWithGamaFrutales();
    }
}
