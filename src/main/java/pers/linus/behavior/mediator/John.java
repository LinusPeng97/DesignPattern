package main.java.pers.linus.behavior.mediator;

public class John extends User {

    public John(String name) {
        super(name);
    }

    @Override
    public void showMessage(String sender, String message) {
        System.out.println(sender + " send send send message! " + name + "get get get message! " + message);
    }
}
