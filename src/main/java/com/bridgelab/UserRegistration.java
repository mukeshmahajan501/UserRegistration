package com.bridgelab;

public class UserRegistration {
    //Method for checking email.
    public boolean validateEmail (String email) {
        String patternEmail = "^[a-zA-Z0-9]+(([._+-]?)[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4}$)*";
        if (email.matches(patternEmail)) {
            return true;
        }
        else {
            return false;
        }
    }

}
