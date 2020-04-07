package main.java.pers.linus.behavior.template;

public abstract class Game {
    protected abstract void initiate();
    protected abstract void start();
    protected abstract void end();

    final public void play() {
        initiate();

        start();

        end();
    }
}
