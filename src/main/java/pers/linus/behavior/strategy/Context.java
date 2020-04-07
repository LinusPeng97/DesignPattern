package main.java.pers.linus.behavior.strategy;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int x, int y) {
        return strategy.getResult(x, y);
    }
}
