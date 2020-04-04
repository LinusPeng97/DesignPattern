package main.java.pers.linus.behavior.command;

public class Sell implements Command{
    private Stock stock;

    public Sell(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
