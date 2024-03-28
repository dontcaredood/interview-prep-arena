package com.designPatterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Game game = new Spiderman();
        game.play();
        Game game1 = new Mario();
        game1.play();

    }
}
