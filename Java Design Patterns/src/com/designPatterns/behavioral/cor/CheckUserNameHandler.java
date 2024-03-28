package com.designPatterns.behavioral.cor;

public class CheckUserNameHandler implements AuthHandler{
    private AuthHandler handler;
    @Override
    public void setHandler(AuthHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(String username, String password) {
        if(UserDatabase.getData().containsKey(username)){
            System.out.println("User available");
            if(handler!=null)
                handler.handleRequest(username, password);
        }else{
            System.out.println("User not available, Please signup");
        }

    }
}
