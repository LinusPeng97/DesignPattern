package main.java.pers.linus.construct.flyweight;

public class Circle implements Shape{

    private int x;
    private int y;
    private int radius;
    private String color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println(color + "    " + x + "    " + y + "    " + radius);
    }

    public Circle(String color) {
        this.color = color;
    }
}
