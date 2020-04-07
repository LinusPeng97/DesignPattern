package main.java.pers.linus.build;

public enum EnumSingleton {
    INSTANCE;

    private ConcreteEnumSingleton singleton;

    EnumSingleton() {
        singleton = new ConcreteEnumSingleton();
    }

    public ConcreteEnumSingleton getInstance() {
        return singleton;
    }
}
