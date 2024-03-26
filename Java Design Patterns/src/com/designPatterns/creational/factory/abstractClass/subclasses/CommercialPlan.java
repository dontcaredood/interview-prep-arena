package com.designPatterns.creational.factory.abstractClass.subclasses;

import com.designPatterns.creational.factory.abstractClass.Plan;

public class CommercialPlan extends Plan {
    public CommercialPlan(){
        System.out.println("COMMERCIAL PLAN");
    }
    @Override
    public void getRate() {
        rate = 7.50;
    }
}
