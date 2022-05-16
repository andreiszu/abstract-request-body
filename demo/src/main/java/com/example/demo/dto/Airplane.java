package com.example.demo.dto;

public class Airplane extends Vehicle {
    private Integer emergencyExits;
    private Integer cabinCrew;

    public Airplane(Integer emergencyExits, Integer cabinCrew, String type) {
        super(type);
        this.emergencyExits = emergencyExits;
        this.cabinCrew = cabinCrew;
    }
}
