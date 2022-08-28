package com.bridgelabz;

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
        assertTrue(UserRegistration.lastName("Papisetty"));
        assertFalse(UserRegistration.lastName("ahhmlm"));
    }
}

