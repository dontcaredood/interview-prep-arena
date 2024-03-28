package com.designPatterns.creational.prototype;

public class Car extends Vehicle{
    private final int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    public void showDetails(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return super.toString()+", Car{" +
                "topSpeed=" + topSpeed +
                '}';
    }

    @Override
    public Vehicle getClone() {
        return this;
    }
}
