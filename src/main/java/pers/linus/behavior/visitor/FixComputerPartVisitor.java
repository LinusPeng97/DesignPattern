package main.java.pers.linus.behavior.visitor;

public class FixComputerPartVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Fixing Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Fixing Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Fixing Keyboard.");
    }
}
