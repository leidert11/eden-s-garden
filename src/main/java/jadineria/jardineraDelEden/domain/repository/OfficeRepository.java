package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {


    // -- Oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
    // SELECT DISTINCT o.codigo_oficina FROM oficina o JOIN empleado e ON o.codigo_oficina = e.codigo_oficina JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas JOIN pago p ON c.codigo_cliente = p.codigo_cliente JOIN pedido pe ON c.codigo_cliente = pe.codigo_cliente JOIN detalle_pedido dp ON pe.codigo_pedido = dp.codigo_pedido JOIN producto pro ON dp.codigo_producto = pro.codigo_producto WHERE pro.gama != 'Frutales';
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
