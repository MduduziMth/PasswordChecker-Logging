import org.junit.jupiter.api.Test;
import sun.security.util.Password;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void TestPasswordIsValid()
    {
        PasswordValidation checker =    new PasswordValidation();
        checker.PasswordIsValid("");

        assertEquals("password should be longer than 8 characters\n" +
                "password should exist\n" +
                "password should at least have one digit\n" +
                "password should have at least one lowercase letter\n" +
                "password should have at least one uppercase letter\n" +
                "password should have at least one special character\n" +
                "password is never Ok!",PasswordValidation.PasswordIsValid(""));

        assertEquals("password should be longer than 8 characters\n" +
                "password should at least have one digit\n" +
                "password should have at least one special character\n"
              ,PasswordValidation.PasswordIsValid("Qwerty"));

        assertEquals( "password should at least have one digit\n",PasswordValidation.PasswordIsValid("Passwor@"));

        assertEquals( "password should have at least one uppercase letter\n",PasswordValidation.PasswordIsValid("passwor@1"));

        assertEquals( "password should have at least one lowercase letter\n",PasswordValidation.PasswordIsValid("PASSWORD@1"));

        assertEquals("password should be longer than 8 characters\n",PasswordValidation.PasswordIsValid("Pa123@"));

        assertEquals("",PasswordValidation.PasswordIsValid("Password123@"));

        assertEquals("password should have at least one special character\n",PasswordValidation.PasswordIsValid("Password1"));


        assertEquals(true, checker.passwordIsOk("Password1"));


        assertEquals(true,PasswordValidation.hasDigit("1asd"));

        assertEquals(false,PasswordValidation.hasDigit("aaa"));

        assertEquals(true,PasswordValidation.hasLowerCase("aaa"));

        assertEquals(false,PasswordValidation.hasLowerCase("AAA"));

        assertEquals(true,PasswordValidation.hasUpperCase("AAA"));

        assertEquals(false,PasswordValidation.hasUpperCase("qwertty"));

        assertEquals(true,PasswordValidation.hasSpecialChar("@wert"));

        assertEquals(false,PasswordValidation.hasSpecialChar("zxcvfd"));


    }

}