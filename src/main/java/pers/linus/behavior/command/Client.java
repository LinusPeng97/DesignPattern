package main.java.pers.linus.behavior.command;

import java.util.LinkedList;

/**
 * 三层结构：Client使用Invoker——>Command——>receiver
 * 此例中Buy和Sell是具体行为，而Stock相当于Receiver是被操作的对象。Invoker则保存需要进行的具体操作。
 */
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Invoker invoker = new Invoker();
        invoker.takeCommand(new Buy(stock));
        invoker.takeCommand(new Sell(stock));
        invoker.executeCommand();
    }
}
