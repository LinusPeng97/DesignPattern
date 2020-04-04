package main.java.pers.linus.behavior.chainofresponsibility;

/**
 * 当需要接收消息的对象有一个，但是一次只需要一个对象处理时，可以使用责任链模式
 */
public class Client {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        infoLogger.logMessage(AbstractLogger.ERROR, "123");

        infoLogger.logMessage(AbstractLogger.DEBUG, "123");

        infoLogger.logMessage(AbstractLogger.INFO, "123");
    }
}
