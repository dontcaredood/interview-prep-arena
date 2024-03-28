package com.designPatterns.behavioral.observer;

public class TVDisplay implements Observer{

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
