package com.designPatterns.behavioral.cor;

public class CorMain {
    public static void main(String[] args) {
        AuthHandler handler = new CheckUserNameHandler();
        AuthHandler handler1 = new CheckUserPassword();
        handler.setHandler(handler1);
        handler.handleRequest("sandy","pass123");

    }
}
