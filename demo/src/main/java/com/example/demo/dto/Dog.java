package com.example.demo.dto;

public class Dog extends Animal {
    private Integer legs;
    private String furColor;

    public Dog(Integer legs, String furColor) {
        this.legs = legs;
        this.furColor = furColor;
    }
}
