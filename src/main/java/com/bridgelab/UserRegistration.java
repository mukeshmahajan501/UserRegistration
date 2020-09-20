package com.bridgelab;

public class UserRegistration {
    //Method for checking mobile number
    public boolean mobileNumber (String mobileNumber){
        return mobileNumber.matches("^[0-9]{2}[ ][1-9]{1}[0-9]{9}");
    }
}
