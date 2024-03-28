package com.designPatterns.behavioral.state;

public class Phone {
    private State state;
    public void setState(State state){
        this.state = state;
    }
    public void handleRequest(){
        state.handleRequest();
    }
}
