package jadineria.jardineraDelEden.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Employee {

    @Id
    @Column(name = "codigo_producto ", nullable = false)
    private String employeeCode;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "apellido1", nullable = false)
    private String firstSurname;

    @Column(name = "apellido2", nullable = false)
    private String secondSurname;

    @Column(name = "extension", nullable = false)
    private String extension;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "codigo_oficina", nullable = false)
    private String officeCode;

    @Column(name = "codigo_jefe", nullable = false)
    private String supervisorCode;

    @Column(name = "puesto", nullable = false)
    private String position;

    public String getemployeeCode() {
        return employeeCode;
    }

    public void setemployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfirstSurname() {
        return firstSurname;
    }

    public void setfirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getsecondSurname() {
        return secondSurname;
    }

    public void setsecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getofficeCode() {
        return officeCode;
    }

    public void setofficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getsupervisorCode() {
        return supervisorCode;
    }

    public void setsupervisorCode(String supervisorCode) {
        this.supervisorCode = supervisorCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
