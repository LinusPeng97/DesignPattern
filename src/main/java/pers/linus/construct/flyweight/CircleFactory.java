package main.java.pers.linus.construct.flyweight;

import java.util.HashMap;

public class CircleFactory {
    private static HashMap<String, Shape> map = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);

        if(circle == null) {
            circle = new Circle(color);
            System.out.println("Creating " + color + " circle");
            map.put(color, circle);
        }

        return circle;
    }
}
