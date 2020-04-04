package main.java.pers.linus.construct.proxy;

/**
 * 当获取对象不方便或者需要在创建对象前后操作时，需要使用代理模式
 */
public class Client {
    public static void main(String[] args) {
        File file = new FileProxy("pzx.jpg");
        file.open();
    }
}
