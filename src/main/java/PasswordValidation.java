import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


import java.util.regex.Pattern;

public class PasswordValidation {

    private static final Logger logger = LogManager.getLogger(PasswordValidation.class.getName());



    public static  int counter = 0;



    public PasswordValidation(){

    }


     public static String  PasswordIsValid(String password){
        String errorMessage = "";

        if(password.length() >= 8) {
                counter ++;
            } else{
            errorMessage +=  "password should be longer than 8 characters\n";
            }

        if(password != "") {
            counter ++;
            } else {
            errorMessage += "password should exist\n";

            }

        if(hasDigit(password)) {
            counter ++;
            } else {
            errorMessage += "password should at least have one digit\n";

            }

        if(hasLowerCase(password)) {
            counter++;
            } else {
            errorMessage += "password should have at least one lowercase letter\n";

        }

        if(hasUpperCase(password)){
            counter++;
        } else {
            errorMessage += "password should have at least one uppercase letter\n";

        }

        if(hasSpecialChar(password)){
            counter++;
        } else{
            errorMessage += "password should have at least one special character\n";

        }

        if(password =="" && password.length() <= 8)

            errorMessage += "password is never Ok!";




        return errorMessage;
     }

    public boolean passwordIsOk(String password)
    {
        if(counter >= 3) {
            logger.debug("User password is ok");
        }else
            logger.debug("User password is not ok");
        return counter >=3;

    }







     public static boolean hasDigit(String Password)
     {
        return Pattern.compile("[0-9]").matcher(Password).find();
     }

    public static boolean hasUpperCase(String Password)
    {
        return Pattern.compile("[A-Z]").matcher(Password).find();
    }

    public static boolean hasLowerCase(String Password)
    {
        return Pattern.compile("[a-z]").matcher(Password).find();
    }

    public static boolean hasSpecialChar(String Password)
    {
        return Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(Password).find();
    }









}
