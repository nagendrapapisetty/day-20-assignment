package com.bridgelabz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
    @Test
    public void testFirstName() throws UserRegistrationException {
        assertTrue(UserRegistration.firstName("nagendra"));
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
        assertFalse(UserRegistration.email("nagendrapapisetty.u,777"));
    }
    @Test
    public void testPhoneNumber() throws UserRegistrationException {
        assertFalse(UserRegistration.phoneNumber("917995976634"));
        assertTrue(UserRegistration.phoneNumber("0 1234567890"));
    }
}