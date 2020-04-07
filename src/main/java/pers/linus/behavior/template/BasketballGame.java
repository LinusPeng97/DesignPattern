package main.java.pers.linus.behavior.template;

public class BasketballGame extends Game {
    @Override
    protected void initiate() {
        System.out.println("Basketball initiate");
    }

    @Override
    protected void start() {
        System.out.println("Basketball start");
    }

    @Override
    protected void end() {
        System.out.println("Basketball end");
    }
}
