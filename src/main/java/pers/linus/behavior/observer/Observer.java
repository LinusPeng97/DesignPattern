package main.java.pers.linus.behavior.observer;

public class Observer {
    String name;

    public Observer(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("啊啊啊啊啊啊!" + name + "要去字节跳动工作啦!!!!");
    }
}
