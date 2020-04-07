package main.java.pers.linus.behavior.state;

public class ConnectedState implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("The Current state is Connected");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Connected!";
    }
}
