package com.designPatterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        System.out.println("PHONE");
        Phone phone = new Phone();
        phone.setState(new OnState());
        phone.handleRequest();
        phone.setState(new LockState());
        phone.handleRequest();
    }
}
