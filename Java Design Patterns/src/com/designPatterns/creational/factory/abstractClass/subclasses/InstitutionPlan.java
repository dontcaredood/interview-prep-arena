package com.designPatterns.creational.factory.abstractClass.subclasses;

import com.designPatterns.creational.factory.abstractClass.Plan;

public class InstitutionPlan extends Plan {
    public InstitutionPlan(){
        System.out.println("INSTITUTIONAL PLAN");
    }
    @Override
    public void getRate() {
        rate = 12.0;
    }
}
