package webapp;

public class UserValidationService {

    public boolean idUserValid(String user, String password) {
        if (user.equals("in28minutes") && password.equals("pass")) {
            return true;
        }
        return false;
    }

}
