package com.bridgelab;

public class UserRegistration {
    //Method for checking email
    public boolean email (String email) {
        return email.matches("^[a-zA-Z0-9]+(([._+-]?)[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2})*$");
    }
}
