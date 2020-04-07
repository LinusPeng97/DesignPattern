package main.java.pers.linus.behavior.strategy;

/**
 * 当需要不同算法实现时，需要用到策略模式
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Plus());
        System.out.println(context.getResult(1, 2));

        context.setStrategy(new Multi());
        System.out.println(context.getResult(1, 2));
    }
}
