package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for last name
    @Test
    public void lastName_returnsTrue_ifLastNameProper() {
        result = userRegistration.lastName("Mahajan");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_returnsFalse_ifNumberOfCharDoesNotMatch() {
        result = userRegistration.lastName("Ma");
        Assert.assertFalse(result);
    }

    @Test
    public void lastName_returnFalse_ifFirstCharNotUppercase() {
        result = userRegistration.lastName("mahajan");
        Assert.assertFalse(result);
    }
}
