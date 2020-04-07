package main.java.pers.linus.behavior.mediator;

/**
 *适用：当一组对象以良好但复杂的方式通信，产生的相互依赖关系结构混乱且难以理解时，就可以使用中介者进行解耦。
 */
public class Client {
    public static void main(String[] args) {
        User linus = new Linus("Linus");
        User john = new John("john");

        Mediator mediator = new MediatorImpl();
        mediator.insertUser(linus);
        mediator.insertUser(john);

        mediator.sendMessage(linus.getName(), john.getName(), "Hello John?");
        mediator.sendMessage(john.getName(), linus.getName(), "Hello Linus?");
    }
}
