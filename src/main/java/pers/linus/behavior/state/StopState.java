package main.java.pers.linus.behavior.state;

public class StopState implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("The Current state is Stopped");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stopped!";
    }
}
