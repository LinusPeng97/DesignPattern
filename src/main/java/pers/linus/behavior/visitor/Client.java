package main.java.pers.linus.behavior.visitor;

/**
 * 访问模式
 * 适用：当数据结构十分稳定，但是访问和操作数据的方式变化很多。比如编译器对抽象语法树的访问有多种形式，如优化，语义分析等等，
 * 每种操作都可以定义一个ConcreteVisitor。
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new DisplayComputerPartVisitor());
        computer.accept(new FixComputerPartVisitor());
    }
}
