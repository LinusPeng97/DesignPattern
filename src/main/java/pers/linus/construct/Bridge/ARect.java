package main.java.pers.linus.construct.Bridge;

public class ARect implements DrawAPI {
    @Override
    public void draw(int x, int y, int radius) {

    }

    @Override
    public void draw(int x, int y, int length, int width) {
        System.out.println("draw A rect");
    }
}
