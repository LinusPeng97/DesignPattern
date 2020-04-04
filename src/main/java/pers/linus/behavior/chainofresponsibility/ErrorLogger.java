package main.java.pers.linus.behavior.chainofresponsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Error Logger");
    }
}
