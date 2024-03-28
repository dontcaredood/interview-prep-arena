package com.designPatterns.behavioral.cor;

public interface AuthHandler {
    void setHandler(AuthHandler handler);
    void handleRequest(String username, String password);
}
