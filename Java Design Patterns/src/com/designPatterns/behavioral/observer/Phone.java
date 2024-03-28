package com.designPatterns.behavioral.observer;

public class Phone implements Observer{
    @Override
    public void update(String message) {
        System.out.println("SMS: "+message);
    }
}
