package homework.util;

import homework.impl.User;

public class Persister implements PersisterTwo {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}