package main.java.pers.linus.construct.Bridge;

public class Rect extends Shape {
    private int x, y, length, width;

    public Rect(int x, int y, int length, int width, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        drawAPI.draw(x, y , length, width);
    }
}
