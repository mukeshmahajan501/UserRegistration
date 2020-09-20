package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for mobile number.
    @Test
    public void mobileNumber_returnTrue_ifMobileNumberIsProper() {
        result = userRegistration.mobileNumber("91 7008409012");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifMobileNumberIsNotTenDigits() {
        result = userRegistration.mobileNumber("91 700840901");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifNoSpaceAfterCountryCode() {
        result = userRegistration.mobileNumber("917008409012");
        Assert.assertFalse(result);

    }

    @Test
    public void mobileNumber_retunFalse_ifNumberIsStartWithzero() {
        result = userRegistration.mobileNumber("91 0308409012");
        Assert.assertFalse(result);

    }
}
