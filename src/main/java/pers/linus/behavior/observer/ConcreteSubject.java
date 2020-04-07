package main.java.pers.linus.behavior.observer;

public class ConcreteSubject extends Subject {
    @Override
    public boolean attach(Observer observer) {
        System.out.println("attach successfully!");
        return observerList.add(observer);
    }

    @Override
    public boolean delet(Observer observer) {
        System.out.println("delete successfully");
        return observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.doSomething();
        }
    }
}
