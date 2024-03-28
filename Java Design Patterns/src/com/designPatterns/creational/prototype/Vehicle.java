package com.designPatterns.creational.prototype;

public abstract class   Vehicle {
    private String brand;
    private String model;
    private String color;

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public abstract Vehicle getClone() ;
}
