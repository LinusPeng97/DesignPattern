package main.java.pers.linus.behavior.strategy;

public class Plus implements Strategy{
    @Override
    public int getResult(int x, int y) {
        return x + y;
    }
}
