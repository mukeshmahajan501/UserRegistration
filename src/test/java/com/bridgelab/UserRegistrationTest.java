package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for password rule 3 - atleast one numeric number.
    @Test
    public void password_returnTrue_ifPasswordHavingAleastOneNumeric(){
        result = userRegistration.password("Abce1defg1");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordNotHavingAleastOneNumeric(){
        result = userRegistration.password("Abcedefghi");
        Assert.assertFalse(result);
    }
}
