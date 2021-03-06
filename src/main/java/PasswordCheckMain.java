import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordCheckMain {

    public static void main(String[] args) {

        final Logger logger = LogManager.getLogger(PasswordCheckMain.class.getName());

        String password = "zxczvxcafaasfafdafafas";

        PasswordValidation checker =  new PasswordValidation();

        logger.error(checker.PasswordIsValid(password));


        if(checker.passwordIsOk(password))
        {
            logger.debug("User password is Ok");
        }
        else{
            logger.error("User password Is not OK");
        }


        //checker.passwordIsOk(password);

        System.out.println( checker.passwordIsOk(password));

    }


}
