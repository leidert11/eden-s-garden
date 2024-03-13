package jadineria.jardineraDelEden.persistence;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pay {

    @Id
    @Column(name = "codigo_cliente", nullable = false)
    private String customerCode;

    @Column(name = "forma_pago", nullable = false)
    private String paymentType;

    @Column(name = "id_transaccion", nullable = false)
    private String transactionId;

    @Column(name = "fecha_pago", nullable = false)
    private String paymentDate;

    @Column(name = "total", nullable = false)
    private double total;


    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
