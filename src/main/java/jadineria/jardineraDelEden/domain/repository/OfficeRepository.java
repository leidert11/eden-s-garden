package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {


    // -- Oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
    @Query("SELECT DISTINCT o.officeCode " +
            "FROM Office o " +
            "JOIN Employee e ON o.officeCode = e.office.officeCode " +
            "JOIN Customer c ON e.employeeCode = c.repSales.employeeCode " +
            "JOIN Payment p ON c.customerCode = p.customer.customerCode " +
            "JOIN Order ord ON c.customerCode = ord.customer.customerCode " +
            "JOIN OrderDetail od ON ord.orderCode = od.order.orderCode " +
            "JOIN Product prod ON od.product.productCode = prod.productCode " +
            "WHERE prod.gamaProduct.gama != 'Frutales'")
    public List<String> getOfficesNotEmployeesHaveClientWithGamaFrutales();
}
