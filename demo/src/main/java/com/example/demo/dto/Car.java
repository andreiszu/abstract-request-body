package com.example.demo.dto;

public class Car extends Vehicle {
    private Integer gears;
    private String licenseNo;

    public Car(Integer gears, String licenseNo, String type) {
        super(type);
        this.gears = gears;
        this.licenseNo = licenseNo;
    }
}
