package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.ProductRepository;
import jadineria.jardineraDelEden.persistence.Office;
import jadineria.jardineraDelEden.persistence.Product;
import jadineria.jardineraDelEden.persistence.dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ServiceInterface<ProductDTO>{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> getAll() {
        return productRepository.findAll().stream()
                .map(Product::toDTO)
                .toList();
    }

    public List<ProductDTO> getProductsAreNotInAnyOrder(){
        return productRepository.getProductsAreNotInAnyOrder().stream()
                .map(Product::toDTO)
                .toList();
    }
    public List<String> getProductsAreNotInAnyOrderNDI(){
        return productRepository.getProductsAreNotInAnyOrderNDI();
    }

    public List<Object[]> findMaxAndMinPrice(){
        return productRepository.findMaxAndMinPrice();
    }
}
