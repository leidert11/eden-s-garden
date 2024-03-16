package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
//     @Query("")
//    public List<> get();


    @Query("SELECT p FROM Product p LEFT JOIN OrderDetail o ON p.productCode = o.product.productCode WHERE o.product.productCode IS NULL")
    public List<Product> getProductsAreNotInAnyOrder();

//   SELECT p.codigo_producto, p.nombre, p.descripcion, g.imagen FROM producto p LEFT JOIN detalle_pedido dp ON p.codigo_producto = dp.codigo_producto JOIN gama_producto g ON p.gama = g.gama WHERE dp.codigo_producto IS NULL;

    @Query("SELECT p.name, p.description, g.image FROM Product p LEFT JOIN OrderDetail o ON p.productCode = o.product.productCode JOIN p.gamaProduct g WHERE o.product.productCode IS NULL")
    public List<String> getProductsAreNotInAnyOrderNDI();

    @Query("SELECT MAX(p.salePrice), MIN(p.salePrice) FROM Product p")
    public List<Object[]> findMaxAndMinPrice();

}
