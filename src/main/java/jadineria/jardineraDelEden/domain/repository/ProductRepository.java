package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
        // Consulta 15
        @Query("SELECT p FROM Product p WHERE p.gamaProduct.gama = 'Ornamentales' AND p.amountInStock > 100 ORDER BY p.salePrice DESC")
        List<Product> findOrnamentalProductsInStock(); 
}
