package com.designPatterns.creational.factory;

import com.designPatterns.creational.factory.abstractClass.Plan;
import com.designPatterns.creational.factory.abstractClass.subclasses.CommercialPlan;
import com.designPatterns.creational.factory.abstractClass.subclasses.DomesticPlan;
import com.designPatterns.creational.factory.abstractClass.subclasses.InstitutionPlan;

public class GetPlanFactory {
    public Plan getPlan(String planName){
        planName = planName.toUpperCase();
        if(planName.equals(null))
            return null;
        return switch (planName) {
            case "DOMESTIC" -> new DomesticPlan();
            case "COMMERCIAL" -> new CommercialPlan();
            case "INSTITUTION" -> new InstitutionPlan();
            default -> null;
        };
    }
}
