package jadineria.jardineraDelEden.domain.service;

import jadineria.jardineraDelEden.domain.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ServiceInterface<T> {
    List<T> getAll();
    ResponseEntity<T> getById(Long id);
    ResponseEntity<T> save(T t);
    ResponseEntity<T> update(Long id,T t);
    void delete(Long id);
}
