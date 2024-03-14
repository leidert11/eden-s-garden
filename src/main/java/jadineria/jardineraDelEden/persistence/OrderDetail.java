package jadineria.jardineraDelEden.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class OrderDetail {

    @Id
    @Column(name = "codigo_pedido", nullable = false)
    private String orderCode;

    @Id
    @Column(name = "codigo_producto", nullable = false)
    private String productCode;

    @Column(name = "cantidad", nullable = false)
    private int quantity;

    @Column(name = "precio_unidad", nullable = false)
    private double unitPrice;

    @Column(name = "numero_linea", nullable = false)
    private int lineNumber;

    @ManyToOne
    @JoinColumn(name = "codigo_pedido", nullable = false, insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "codigo_producto", nullable = false, insertable = false, updatable = false)
    private Product product;


    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
