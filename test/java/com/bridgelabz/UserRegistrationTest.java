package com.bridgelabz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
    @Test
    public void testFirstName() throws UserRegistrationException {
        assertTrue(UserRegistration.firstName("Nagendra"));
        assertFalse(UserRegistration.firstName("fkdfmek"));
    }

    @Test
    public void testLastName() throws UserRegistrationException {
        assertTrue(UserRegistration.lastName("papisetty"));
        assertFalse(UserRegistration.lastName("ahhmlm"));
    }

    @Test
    public void testEmail() throws UserRegistrationException {
        assertTrue(UserRegistration.email("nagendrapapisetty52@gamil.com"));
        assertFalse(UserRegistration.email("nagendrapapisetty52.u,777"));
    }

    @Test
    public void testPhoneNumber() throws UserRegistrationException {
        assertFalse(UserRegistration.phoneNumber("917995976634"));
        assertTrue(UserRegistration.phoneNumber("0 1234567890"));
    }

    @Test
    public void testPassword() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule1("asshhhhh"));
        assertFalse(UserRegistration.passwordRule1("aabcd"));
    }

    @Test
    public void testPassword1() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule2("AsHushir"));
        assertFalse(UserRegistration.passwordRule2("ashwbhw"));
    }

    @Test
    public void testPassword2() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule3("Password1"));
        assertFalse(UserRegistration.passwordRule3("jndkajdj"));
    }

    @Test
    public void testPassword3() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule4("Password@123"));
        assertFalse(UserRegistration.passwordRule4("asadf12s@@"));
    }

    @Test
    public void testemailId() throws UserRegistrationException {
        assertTrue(UserRegistration.emailIdValidator("abc@yahoo.com,\n" +
                "abc-100@yahoo.com,\n" +
                "abc.100@yahoo.com\n" +
                "abc111@abc.com,\n" +
                "abc-100@abc.net,\n" +
                "abc.100@abc.com.au\n" +
                "abc+100@1.com,\n" +
                "abc.632@gmail.com.com\n" +
                "abc+100@gmail.com"));
        assertFalse(UserRegistration.emailIdValidator("abc@%*.com"));
    }
}