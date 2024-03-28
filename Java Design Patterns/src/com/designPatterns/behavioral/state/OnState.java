package com.designPatterns.behavioral.state;

public class OnState implements State{
    @Override
    public void handleRequest() {
        System.out.println("PHONE DISPLAY ON");
    }
}
