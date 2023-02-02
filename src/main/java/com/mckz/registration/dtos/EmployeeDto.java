package com.mckz.registration.dtos;

import java.util.UUID;

public class EmployeeDto {

    private UUID employeeid;

    private String employeeName;

    private String address;

    private int mobile;

    public EmployeeDto(UUID employeeid, String employeeName, String address, int mobile) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.address = address;
        this.mobile = mobile;
    }

    public UUID getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(UUID employeeid) {
        this.employeeid = employeeid;
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
