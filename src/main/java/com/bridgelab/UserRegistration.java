package com.bridgelab;

public class UserRegistration {
    //Method for checking valid password.
    public boolean password (String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$");
    }
}
