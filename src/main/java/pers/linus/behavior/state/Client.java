package main.java.pers.linus.behavior.state;

/**
 * 状态模式（State）
 * 当一个对象的行为根据其状态进行改变时，可以使用状态模式。尤其是连接状态可以使用该模式。
 */
public class Client {
    public static void main(String[] args) {
        State stopState = new StopState();
        State connectedState = new ConnectedState();

        Context context = new Context();
        stopState.doSomething(context);
        System.out.println(context.getState().toString());

        connectedState.doSomething(context);
        System.out.println(context.getState().toString());
    }
}
