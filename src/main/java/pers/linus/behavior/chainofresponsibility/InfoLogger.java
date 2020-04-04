package main.java.pers.linus.behavior.chainofresponsibility;

public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Info Logger");
    }
}
