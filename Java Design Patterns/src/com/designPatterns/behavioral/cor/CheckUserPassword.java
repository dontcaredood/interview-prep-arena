package com.designPatterns.behavioral.cor;

public class CheckUserPassword implements AuthHandler {

    private AuthHandler handler;
    @Override
    public void setHandler(AuthHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(String username, String password) {
        String userPass = UserDatabase.getData().get(username);
        if(userPass.equals(password)){
            System.out.println("User logged In");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
