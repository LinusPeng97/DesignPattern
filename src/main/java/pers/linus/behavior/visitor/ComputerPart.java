package main.java.pers.linus.behavior.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
