package main.java.pers.linus.behavior.mediator;

public interface Mediator {
    void sendMessage(String sender, String receiver, String message);
    void insertUser(User user);
}
