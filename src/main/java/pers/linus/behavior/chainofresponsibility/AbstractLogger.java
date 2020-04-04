package main.java.pers.linus.behavior.chainofresponsibility;

public abstract class AbstractLogger {
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;

    private AbstractLogger nextLogger;

    private int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (level < this.level) {
            nextLogger.logMessage(level, message);
            return;
        }
        writeMessage(message);
    }

    protected abstract void writeMessage(String message);
}
