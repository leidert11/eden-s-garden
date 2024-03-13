package jadineria.jardineraDelEden.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Order {

    @Id
    @Column(name = "codigo_pedido", nullable = false)
    private String orderCode;

    @Column(name = "fecha_pedido", nullable = false)
    private String orderDate;

    @Column(name = "fecha_esperada", nullable = false)
    private String expectedDate;

    @Column(name = "fecha_entrega")
    private String deliveryDate;

    @Column(name = "estado", nullable = false)
    private String status;

    @Column(name = "comentarios")
    private String comments;

    @Column(name = "codigo_cliente", nullable = false)
    private String customerCode;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
