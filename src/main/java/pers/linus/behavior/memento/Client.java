package main.java.pers.linus.behavior.memento;

/**
 * 备忘录模式（Memento）
 * 适用：当必须保存一个对象在某个时刻的部分状态，并且在之后的某个时刻需要恢复它时可以使用备忘录模式。
 * 关键点：Originator封装Memento来获得状态，所有状态全部保存在careTaker中
 */

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("State 0");
        CareTaker careTaker = new CareTaker();
        careTaker.saveMemento(originator.saveToMemento());
        originator.setState("State 1");
        careTaker.saveMemento(originator.saveToMemento());
        originator.setState("State 2");
        careTaker.saveMemento(originator.saveToMemento());

        System.out.println(originator.getStateFromMemento(careTaker.getMemento(0)));
        System.out.println(originator.getStateFromMemento(careTaker.getMemento(1)));
        System.out.println(originator.getCurrentState());
    }
}
