package main.java.pers.linus.behavior.mediator;

public class Linus extends User {

    public Linus(String name) {
        super(name);
    }

    @Override
    public void showMessage(String sender, String message) {
        System.out.println(sender + " send message " + name + " get message: " + message);
    }
}
