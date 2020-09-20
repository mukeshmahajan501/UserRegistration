package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;
    //Test cases for email
    @Test
    public void email_returnTrue_ifEmailIsProper(){
        result = userRegistration.email("mukesh.mahajan@gmail.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void email_returnFalse_ifEmailIsNotProper(){
        result = userRegistration.email("mukesh.mahajan$blz.co.in");
        Assert.assertFalse(result);
    }

    @Test
    public void email_returnFalse_ifInEmailSingleDotIsNotThere(){
        result = userRegistration.email("mukesh.mahajan@gmail..com");
        Assert.assertFalse(result);
    }
}
