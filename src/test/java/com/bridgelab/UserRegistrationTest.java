package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for password
    @Test
    public void password_returnTrue_ifPasswordIsProper(){
        result = userRegistration.password("abcdEF12");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordIsLessThanEightCharacter(){
        result = userRegistration.password("abcdeF1");
        Assert.assertFalse(result);
    }
}
