package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.GamaProductRepository;
import jadineria.jardineraDelEden.persistence.GamaProduct;
import jadineria.jardineraDelEden.persistence.dtos.GamaProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaProductServiceImpl implements ServiceInterface<GamaProductDTO>{
    final private GamaProductRepository gamaProductRepository;

    @Autowired
    public GamaProductServiceImpl(GamaProductRepository gamaProductRepository) {
        this.gamaProductRepository = gamaProductRepository;
    }


    @Override
    public List<GamaProductDTO> getAll() {
        return gamaProductRepository.findAll().stream()
                .map(GamaProduct::toDTO)
                .toList();
    }
}
