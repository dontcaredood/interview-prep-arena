package com.designPatterns.behavioral.template;

public class Spiderman extends Game{
    @Override
    void initialize() {
        System.out.println("Welcome to Spidy universe");
    }

    @Override
    void start() {
        System.out.println("Game Started");
    }

    @Override
    void end() {
        System.out.println("Game Ended");
    }
}
