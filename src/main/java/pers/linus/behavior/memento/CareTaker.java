package main.java.pers.linus.behavior.memento;

import java.util.LinkedList;
import java.util.List;

public class CareTaker {
    List<Memento> list = new LinkedList<>();

    public boolean saveMemento(Memento memento) {
        System.out.println("Save successfully!");
        return list.add(memento);
    }

    public Memento getMemento(int index) {
        return list.get(index);
    }
}
