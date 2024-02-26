package homework.impl;

import homework.util.Persister;
import homework.util.PersisterTwo;

public class UserManager {
private static User user;
private static PersisterTwo persisterTwo;

    public UserManager(User user){
        this.user = user;
        this.persisterTwo = new Persister();
    }

    public static void report() {
        System.out.println("Report for user: " + user.getName());
    }

    public static void save() {
        persisterTwo.save(user);
    }
}
