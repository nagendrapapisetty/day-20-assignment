package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String LastName) throws UserRegistrationException {
        if (LastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (LastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{5,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(LastName);
            return matcher.matches();
        }
    }
}