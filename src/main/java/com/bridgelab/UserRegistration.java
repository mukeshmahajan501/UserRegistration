package com.bridgelab;

public class UserRegistration {
    //Method for checking valid password.
    public boolean password (String password) {
        return password.matches("^[a-zA-Z0-9]{8,}$");
    }
}
