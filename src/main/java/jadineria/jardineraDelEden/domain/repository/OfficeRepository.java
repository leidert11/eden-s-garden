package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {
}
