package com.designPatterns.behavioral.state;

public class LockState implements State{
    @Override
    public void handleRequest() {
        System.out.println("PHONE DISPLAY OFF");
    }
}
