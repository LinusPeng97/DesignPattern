package main.java.pers.linus.behavior.mediator;

public abstract class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showMessage(String sender, String message);
}
