package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    boolean result;
    private final String keys;
    private final boolean values;

    public UserRegistrationTest(String keys, boolean values) {
        this.keys = keys;
        this.values = values;
    }

    //Test cases for email
    @Parameterized.Parameters
    public static Collection<Object[]> testCasesForEmail() {
        Object[][] testingEmails = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc@1.com", true},
                {"abc.100@abc.com.au",true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {".abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
               {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false},
        };
        return Arrays.asList(testingEmails);
    }

    @Test
    public void validEmail() {
        boolean result = userRegistration.validateEmail(keys);
        Assert.assertEquals(result, values);
    }
}
