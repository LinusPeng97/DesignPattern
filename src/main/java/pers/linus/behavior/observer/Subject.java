package main.java.pers.linus.behavior.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    List<Observer> observerList= new LinkedList<>();
    public abstract boolean attach(Observer observer);
    public abstract boolean delet(Observer observer);
    public abstract void notifyObserver();
}
