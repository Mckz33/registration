package com.mckz.registration.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "employee_name", length = 45)
    private String employeeName;

    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "mobile", length = 45)
    private int mobile;

    public EmployeeModel(UUID id, String employeeName, String address, int mobile) {
        this.id = id;
        this.employeeName = employeeName;
        this.address = address;
        this.mobile = mobile;
    }

    public EmployeeModel() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
