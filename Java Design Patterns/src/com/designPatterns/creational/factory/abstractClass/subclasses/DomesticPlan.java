package com.designPatterns.creational.factory.abstractClass.subclasses;

import com.designPatterns.creational.factory.abstractClass.Plan;

public class DomesticPlan extends Plan {
    DomesticPlan(){
        System.out.println("DOMESTIC PLAN");
    }
    @Override
    public void getRate() {
        rate = 5.0;
    }
}
