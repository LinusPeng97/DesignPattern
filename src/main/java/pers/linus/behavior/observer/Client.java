package main.java.pers.linus.behavior.observer;

/**
 * 观察者模式（发布-订阅）
 * 适用：一个对象改变需要同时改变其他对象而又不知道哪些对象需要改变。
 */
public class Client {
    public static void main(String[] args) {
        Observer observer1 = new Observer("pzx");
        Observer observer2 = new Observer("彭泽新");
        Observer observer3 = new Observer("Star丿pzx");

        Subject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.delet(observer2);

        subject.notifyObserver();
    }
}
