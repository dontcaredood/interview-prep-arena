package com.designPatterns.behavioral.template;

public class Mario extends Game{
    @Override
    void initialize() {
        System.out.println("mario - Legendary Game");
    }

    @Override
    void start() {
        System.out.println("Game Started");
    }

    @Override
    void end() {
        System.out.println("Well Played");
    }
}
