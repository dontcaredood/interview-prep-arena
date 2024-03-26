package com.designPatterns.creational.factory.abstractClass;

public abstract class Plan {
    public double rate;

    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units+" units, "+rate+" per unit "+ "--> Rs."+rate*units);
        //System.out.println(rate * units);
    }
}
