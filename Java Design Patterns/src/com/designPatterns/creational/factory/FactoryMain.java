package com.designPatterns.creational.factory;

import com.designPatterns.creational.factory.abstractClass.Plan;

import java.util.List;

public class FactoryMain {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        List<String> plansList = List.of("DOMESTIC","COMMERCIAL","INSTITUTION");
        List<Integer> units = List.of(120,3452,9998);
        for(int i=0; i< plansList.size();i++){
            String planName = plansList.get(i);
            Plan plan = getPlanFactory.getPlan(plansList.get(i));
            plan.getRate();
            plan.calculateBill(units.get(i));
        }
    }
}
