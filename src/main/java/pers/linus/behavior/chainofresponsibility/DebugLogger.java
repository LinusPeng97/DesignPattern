package main.java.pers.linus.behavior.chainofresponsibility;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Debug Logger");
    }
}
