package jadineria.jardineraDelEden.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// CREATE TABLE detalle_pedido (
//   codigo_pedido INTEGER NOT NULL,
//   codigo_producto VARCHAR(15) NOT NULL,
//   cantidad INTEGER NOT NULL,
//   precio_unidad NUMERIC(15,2) NOT NULL,
//   numero_linea SMALLINT NOT NULL);

@Entity
@Table(name = "detalle_pedido")
public class OrderDetail {

    @Id
    @Column(name = "codigo_pedido", nullable = false)
    private String orderCode;

    @Column(name = "codigo_producto", nullable = false)
    private String productCode;

    @Column(name = "cantidad", nullable = false)
    private int quantity;

    @Column(name = "precio_unidad", nullable = false)
    private double unitPrice;

    @Column(name = "numero_linea", nullable = false)
    private int lineNumber;


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
