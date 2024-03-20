package jadineria.jardineraDelEden.domain.repository;

import jadineria.jardineraDelEden.persistence.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {
    // 1. Devuelve un listado con el código de oficina y la ciudad donde hay
    // oficinas.
    @Query("SELECT o.officeCode, o.city FROM Office o")
    List<Object[]> findOfficeCodeAndCity();

    // 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
    @Query("SELECT o.city, o.phone FROM Office o WHERE o.country = 'España'")
    List<Object[]> findCityAndPhoneInSpain();

    // 20. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus
    // representantes junto con la ciudad de la oficina a la que pertenece el
    // representante.
    @Query("SELECT DISTINCT c.customerName, e.name, e.lastName1, o.city FROM Customer c JOIN c.repSales e JOIN e.office o WHERE EXISTS (SELECT p FROM Payment p WHERE p.customer = c)")
    List<Object[]> findCustomersWithPaymentsAndTheirSalesRepAndOfficeCity();

    // 22
    @Query("SELECT DISTINCT CASE WHEN o.addressLine2 = '' THEN o.addressLine1 ELSE CONCAT(o.addressLine1, ' - ', o.addressLine2) END AS direccionOficina FROM Customer c JOIN Employee e ON c.repSales.employeeCode = e.employeeCode JOIN Office o ON e.office.officeCode = o.officeCode WHERE c.city = 'Fuenlabrada'")
    List<String> findOfficeAddressesInFuenlabrada();

    // -- Oficinas donde no trabajan ninguno de los empleados que hayan sido los
    // representantes de ventas de algún cliente que haya realizado la compra de
    // algún producto de la gama Frutales.
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
