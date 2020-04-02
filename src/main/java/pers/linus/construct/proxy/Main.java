package main.java.pers.linus.construct.proxy;

public class Main {
    public static void main(String[] args) {
        File file = new FileProxy("pzx.jpg");
        file.open();
    }
}
