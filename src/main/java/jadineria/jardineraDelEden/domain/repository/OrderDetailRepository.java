package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetail;
import jadineria.jardineraDelEden.persistence.orderdetail.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
//     @Query("")
//    public List<> get();

    @Query("SELECT od.id.orderCode, COUNT(DISTINCT od.id.productCode) FROM OrderDetail od GROUP BY od.id.orderCode")
    public List<Object> countDistinctProductsByOrder();

    @Query("SELECT dp.id.orderCode, SUM(dp.amount) FROM OrderDetail dp GROUP BY dp.id.orderCode")
    public List<Object[]> sumQuantityByOrder();

    @Query("SELECT od.id.productCode, SUM(od.amount) AS totalSold FROM OrderDetail od GROUP BY od.id.productCode ORDER BY totalSold DESC LIMIT 20")
    public List<Object[]> findTop20ProductsByTotalSold();

    @Query("SELECT SUM(od.amount * p.salePrice) AS base_imponible, " +
            "SUM(od.amount * p.salePrice) * 0.21 AS IVA, " +
            "SUM(od.amount * p.salePrice) * 1.21 AS total_facturado " +
            "FROM OrderDetail od " +
            "JOIN od.product p")
    public List<Object[]> calculateInvoiceTotals();

    @Query("SELECT dp.product.productCode, " +
            "SUM(dp.amount * dp.unitPrice) AS baseImponible, " +
            "SUM(dp.amount * dp.unitPrice) * 0.21 AS iva, " +
            "SUM(dp.amount * dp.unitPrice) * 1.21 AS totalFacturado " +
            "FROM OrderDetail dp " +
            "GROUP BY dp.product.productCode")
    public List<Object[]> calculateProductInvoiceTotals();

    @Query("SELECT dp.product.productCode, " +
            "SUM(dp.amount * dp.unitPrice) AS baseImponible, " +
            "SUM(dp.amount * dp.unitPrice) * 0.21 AS iva, " +
            "SUM(dp.amount * dp.unitPrice) * 1.21 AS totalFacturado " +
            "FROM OrderDetail dp " +
            "JOIN dp.product p " +
            "WHERE p.productCode LIKE 'OR%' " +
            "GROUP BY dp.product.productCode")
    public List<Object[]> calculateTotalByProductStartingWithOR();

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
