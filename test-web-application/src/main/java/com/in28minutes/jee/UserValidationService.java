package com.in28minutes.jee;

public class UserValidationService {

    public boolean idUserValid(String user, String password) {
        if (user.equals("in28minutes") && password.equals("pass")) {
            return true;
        }
        return false;
    }

}
