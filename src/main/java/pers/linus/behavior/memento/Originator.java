package main.java.pers.linus.behavior.memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getCurrentState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }
}
