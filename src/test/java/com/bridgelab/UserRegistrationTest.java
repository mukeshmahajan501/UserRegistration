package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for password rule 4 - exactly one special character.
    @Test
    public void password_returnTrue_ifPasswordHavingAleastOneSpecialCharacter(){
        result = userRegistration.password("Abce1defg1@");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordNotHavingAleastOneSecialCharacter(){
        result = userRegistration.password("Abcedefghi");
        Assert.assertFalse(result);
    }
}
