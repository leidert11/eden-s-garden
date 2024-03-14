package jadineria.jardineraDelEden.persistence;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Product {

    @Id
    @Column(name = "codigo_producto ", nullable = false)
    private String productCode;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "dimensiones", nullable = false)
    private String dimensions;

    @Column(name = "proveedor", nullable = false)
    private String supplier;

    @Column( name = "descripcion", nullable = false,columnDefinition = "TEXT")
    private String description;

    @Column(name = "cantidad_en_stock", nullable = false)
    private Long quantityInStock;

    @Column(name = "precio_venta", nullable = false)
    private double salePrice;

    @Column(name = "precio_proveedor", nullable = false)
    private String supplierPrice;

    @ManyToOne
    @JoinColumn(name = "gama", nullable = false)
    private ProductRange range;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public String getproductCode() {
        return productCode;
    }

    public void setproductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Long quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getsalePrice() {
        return salePrice;
    }

    public void setsalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getsupplierPrice() {
        return supplierPrice;
    }

    public void setsupplierPrice(String supplierPrice) {
        this.supplierPrice = supplierPrice;
    }
}
