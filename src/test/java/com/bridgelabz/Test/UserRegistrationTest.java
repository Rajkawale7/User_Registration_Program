package com.bridgelabz.Test;
import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    //Test cases to check and validate the User's first Name must be "True"
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result = userRegistration.validateFirstName("Raj");
        Assertions.assertTrue(result);
    }

    //Test cases to check and validate the User's Last Name must be "True"
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result = userRegistration.validatelastName("Kawale");
        Assertions.assertTrue(result);
    }

    //Test cases to check and validate the User's EmailId must be "True"
    @Test
    public void givenEmailID_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result = userRegistration.validateEmail("rajkawale00@gmail.com");
        Assertions.assertTrue(result);
    }

    //Test cases to check and validate the User's Mobile number must be "True"
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result = userRegistration.validateMobileNumber("9049331047");
        Assertions.assertTrue(result);
    }

    //Test cases to check and validate the User's Password must be "True"
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result = userRegistration.validatePassword("Raj123@");
        Assertions.assertTrue(result);
    }
}
