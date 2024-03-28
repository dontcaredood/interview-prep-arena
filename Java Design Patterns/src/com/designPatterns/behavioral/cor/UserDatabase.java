package com.designPatterns.behavioral.cor;

import java.util.HashMap;

public class UserDatabase {
    public static HashMap<String, String> userData = new HashMap<>();

    static {
        userData.put("sandy","pass123");
        userData.put("kun","pass123");
        userData.put("mario","pass123");
    }
    public static HashMap<String, String> getData(){
        return userData;
    }
}
