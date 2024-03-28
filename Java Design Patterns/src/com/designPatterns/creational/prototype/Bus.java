package com.designPatterns.creational.prototype;

public class Bus extends Vehicle{
    private int wheels;

    public Bus(String brand, String model, String color, int wheels) {
        super(brand, model, color);
        this.wheels = wheels;
    }
    public void showDetails(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()+", Bus{" +
                "wheels=" + wheels +
                '}';
    }

    @Override
    public Vehicle getClone() {
        return null;
    }
}
