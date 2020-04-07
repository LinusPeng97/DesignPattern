package main.java.pers.linus.behavior.mediator;

import java.util.HashMap;

public class MediatorImpl implements Mediator {
    HashMap<String, User> hashMap = new HashMap<>();

    @Override
    public void insertUser(User user) {
        hashMap.put(user.getName(), user);
    }

    @Override
    public void sendMessage(String sender, String receiver, String message) {
        hashMap.get(receiver).showMessage(sender, message);
    }
}
