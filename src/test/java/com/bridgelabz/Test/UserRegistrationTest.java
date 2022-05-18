package com.bridgelabz.Test;
import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    //Test cases to check and validate the User's first Name must be "True"
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result1 = userRegistration.validFirstName("Raj");
        Assertions.assertTrue(result1);
    }

    //Test cases to check and validate the User's Last Name must be "True"
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result2 = userRegistration.validateLastName("Kawale");
        Assertions.assertTrue(result2);
    }

    //Test cases to check and validate the User's EmailId must be "True"
    @Test
    public void givenEmailID_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result3 = userRegistration.validateEmail("rajkawale00@gmail.com");
        Assertions.assertTrue(result3);
    }

    //Test cases to check and validate the User's Mobile number must be "True"
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result4 = userRegistration.validateMobileNumber("9049331047");
        Assertions.assertTrue(result4);
    }

    //Test cases to check and validate the User's Password must be "True"
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result5 = userRegistration.validatePassword("Raj123@");
        Assertions.assertTrue(result5);
    }
}
