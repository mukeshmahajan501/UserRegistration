package com.bridgelab;

public class UserRegistration {
    //Method for checking valid password.
    public boolean password (String password) {
        return password.matches("(?=[^A-Z]*[A-Z])[0-9a-zA-A]{8,}$");
    }
}
