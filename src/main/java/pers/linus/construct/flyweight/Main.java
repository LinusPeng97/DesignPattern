package main.java.pers.linus.construct.flyweight;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = (Circle) CircleFactory.getCircle("green");
        circle1.setRadius(1);
        circle1.setX(2);
        circle1.setY(3);
        circle1.draw();

        Circle circle2 = (Circle) CircleFactory.getCircle("red");
        circle2.setRadius(4);
        circle2.setX(5);
        circle2.setY(6);
        circle2.draw();

        Circle circle3 = (Circle) CircleFactory.getCircle("green");
        circle3.setRadius(7);
        circle3.setX(8);
        circle3.setY(9);
        circle3.draw();
    }
}
