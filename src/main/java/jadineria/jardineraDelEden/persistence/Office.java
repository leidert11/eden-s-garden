package jadineria.jardineraDelEden.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oficina")
public class Office {

    @Id
    @Column(name = "codigo_oficina", nullable = false)
    private String officeCode;

    @Column(name = "ciudad", nullable = false)
    private String city;

    @Column(name = "pais", nullable = false)
    private String country;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "codigo_postal", nullable = false)
    private String postalCode;

    @Column(name = "telefono", nullable = false)
    private String phone;

    @Column(name = "linea_direccion1", nullable = false)
    private String addressLine1;

    @Column(name = "linea_direccion2", nullable = false)
    private String addressLine2;

    public String getofficeCode() {
        return officeCode;
    }

    public void setofficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
}
