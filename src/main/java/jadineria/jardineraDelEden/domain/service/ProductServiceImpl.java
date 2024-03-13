package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.ProductRepository;
import jadineria.jardineraDelEden.persistence.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ServiceInterface<Product>{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<Product> getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Product> save(Product product) {
        return null;
    }

    @Override
    public ResponseEntity<Product> update(Long id, Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
