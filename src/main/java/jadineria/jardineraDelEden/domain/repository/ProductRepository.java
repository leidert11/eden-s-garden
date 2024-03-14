package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
