package main.java.pers.linus.behavior.template;

public class FootballGame extends Game {
    @Override
    protected void initiate() {
        System.out.println("Football initiate");
    }

    @Override
    protected void start() {
        System.out.println("Football start");
    }

    @Override
    protected void end() {
        System.out.println("Football end");
    }
}
