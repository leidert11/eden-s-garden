package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.GamaProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamaProductRepository extends JpaRepository<GamaProduct, String> {
}
