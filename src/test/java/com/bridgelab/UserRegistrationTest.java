package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for password rule2 - atleast one Uppercase.
    @Test
    public void password_returnTrue_ifPasswordHavingAleastOneUpperCase(){
        result = userRegistration.password("Abced1234");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordNotHavingAleastOneUpperCase(){
        result = userRegistration.password("abcedefgh");
        Assert.assertFalse(result);
    }
}
