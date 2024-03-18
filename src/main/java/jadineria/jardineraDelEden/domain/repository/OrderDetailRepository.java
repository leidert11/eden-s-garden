package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetail;
import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {

    // Número de productos diferentes que hay en cada uno de los pedidos.
    @Query("SELECT od.id.orderCode, COUNT(DISTINCT od.id.productCode) FROM OrderDetail od GROUP BY od.id.orderCode")
    public List<Object> countDistinctProductsByOrder();

    // Suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
    @Query("SELECT dp.id.orderCode, SUM(dp.amount) FROM OrderDetail dp GROUP BY dp.id.orderCode")
    public List<Object[]> sumQuantityByOrder();

    // Listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas.
    @Query("SELECT od.id.productCode, SUM(od.amount) AS totalSold FROM OrderDetail od GROUP BY od.id.productCode ORDER BY totalSold DESC LIMIT 20")
    public List<Object[]> findTop20ProductsByTotalSold();

    // Facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.
    @Query("SELECT SUM(od.amount * p.salePrice) AS base_imponible, " +
            "SUM(od.amount * p.salePrice) * 0.21 AS IVA, " +
            "SUM(od.amount * p.salePrice) * 1.21 AS total_facturado " +
            "FROM OrderDetail od " +
            "JOIN od.product p")
    public List<Object[]> calculateInvoiceTotals();

    // La misma información que en la pregunta anterior, pero agrupada por código de producto.
    @Query("SELECT dp.product.productCode, " +
            "SUM(dp.amount * dp.unitPrice) AS baseImponible, " +
            "SUM(dp.amount * dp.unitPrice) * 0.21 AS iva, " +
            "SUM(dp.amount * dp.unitPrice) * 1.21 AS totalFacturado " +
            "FROM OrderDetail dp " +
            "GROUP BY dp.product.productCode")
    public List<Object[]> calculateProductInvoiceTotals();

    // La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
    @Query("SELECT dp.product.productCode, " +
            "SUM(dp.amount * dp.unitPrice) AS baseImponible, " +
            "SUM(dp.amount * dp.unitPrice) * 0.21 AS iva, " +
            "SUM(dp.amount * dp.unitPrice) * 1.21 AS totalFacturado " +
            "FROM OrderDetail dp " +
            "JOIN dp.product p " +
            "WHERE p.productCode LIKE 'OR%' " +
            "GROUP BY dp.product.productCode")
    public List<Object[]> calculateTotalByProductStartingWithOR();

    // Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA). /calculate-total-by-product
    @Query("SELECT " +
            "dp.product.name, " +
            "SUM(dp.amount) AS unitsSold, " +
            "SUM(dp.amount * p.salePrice) AS totalRevenue, " +
            "SUM(dp.amount * p.salePrice) * 1.21 AS totalWithIVA " +
            "FROM OrderDetail dp " +
            "JOIN dp.product p " +
            "GROUP BY dp.product.name " +
            "HAVING SUM(dp.amount * p.salePrice) > 3000")
    public List<Object[]> calculateTotalByProduct();
}
