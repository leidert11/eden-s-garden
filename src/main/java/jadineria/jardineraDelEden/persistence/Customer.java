package jadineria.jardineraDelEden.persistence;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Customer {

        @Id
        @Column(name = "codigo_cliente", nullable = false)
        private String customerCode;

        @Column(name = "nombre_cliente", nullable = false)
        private String name;

        @Column(name = "nombre_contacto", nullable = false)
        private String contactName;

        @Column(name = "apellido_contacto", nullable = false)
        private String contactSurname;

        @Column(name = "telefono", nullable = false)
        private String phone;

        @Column(name = "fax", nullable = false)
        private String fax;

        @Column(name = "linea_direccion1", nullable = false)
        private String addressLine1;

        @Column(name = "linea_direccion2", nullable = false)
        private String addressLine2;

        @Column(name = "ciudad", nullable = false)
        private String city;

        @Column(name = "region", nullable = false)
        private String region;

        @Column(name = "pais", nullable = false)
        private String country;

        @Column(name = "codigo_postal", nullable = false)
        private String postalCode;

        @Column(name = "codigo_empleado_rep_ventas", nullable = false)
        private String salesRepCode;

        @Column(name = "limiteCredito", nullable = false)
        private String creditLimit;

        @ManyToOne
        @JoinColumn(name = "codigo_empleado_rep_ventas", insertable = false, updatable = false)
        private Employee salesRep;
    
        @OneToMany(mappedBy = "customer")
        private List<Order> orders = new ArrayList<>();
    
        @OneToMany(mappedBy = "customer")
        private List<Payment> payments = new ArrayList<>();

    public String getcustomerCode() {
        return customerCode;
    }

    public void setcustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcontactName() {
        return contactName;
    }

    public void setcontactName(String contactName) {
        this.contactName = contactName;
    }

    public String getcontactSurname() {
        return contactSurname;
    }

    public void setcontactSurname(String contactSurname) {
        this.contactSurname = contactSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getaddressLine1() {
        return addressLine1;
    }

    public void setaddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressline2() {
        return addressLine2;
    }

    public void setaddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getpostalCode() {
        return postalCode;
    }

    public void setpostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getsalesRepCode() {
        return salesRepCode;
    }

    public void setsalesRepCode(String salesRepCode) {
        this.salesRepCode = salesRepCode;
    }

    public String getcreditLimit() {
        return creditLimit;
    }

    public void setcreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }
}
