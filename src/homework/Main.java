package homework;

import homework.impl.User;
import homework.impl.UserManager;

public class Main{
    public static void main(String[] args){
        new UserManager(new User("Denis"));
        UserManager.report();
        UserManager.save();
    }
}