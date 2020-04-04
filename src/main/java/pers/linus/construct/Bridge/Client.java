package main.java.pers.linus.construct.Bridge;

/**
 * 适用情况:减少类继承关系。抽象类和具体实现分别变化（新功能，新平台）。
 * 优点:Shape类有两个抽象：Circle和Rect。又有两个平台Green和Yellow实现它。当需要增加Triangle抽象时，在Green和Yellow两个平台移植
 * 很方便，Triangle不需要和具体平台绑定。
 */
public class Client {
    public static void main(String[] args) {
        Circle ACircle = new Circle(1, 2, 3, new ACircle());
        Circle BCircle = new Circle(1, 2, 3, new BCircle());
        ACircle.draw();
        BCircle.draw();

        Rect ARect = new Rect(1, 2, 3, 4, new ARect());
        Rect BRect = new Rect(1, 2, 3, 4, new BRect());
        ARect.draw();
        BRect.draw();
    }

}
