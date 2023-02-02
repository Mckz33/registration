package com.mckz.registration.models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;

    @Column(name = "employee_name", length = 45)
    private String employeeName;

    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "mobile", length = 45)
    private int mobile;

}
