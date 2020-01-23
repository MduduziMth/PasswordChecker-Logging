import java.util.regex.Pattern;

public class PasswordValidation {

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

        if(!password.isEmpty()) {
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

    public static boolean passwordIsOk(String password)
    {
        if(!password.isEmpty() && password.length() < 8){
            return false;
        }
<<<<<<< HEAD
        else {
            return counter >= 3;
        }

=======
        else 
            return counter >= 3;
       
>>>>>>> 8824df714d666e4b0cf3341743f012b4b46c3aa2
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

    public static boolean hasSpecialChar(String Password) { return Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(Password).find(); }









}
