package main.java.pers.linus.build;

public class Client {
    public static void main(String[] args) {
        VolatileSingleton singleton = VolatileSingleton.getInstance();

        ConcreteEnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        
    }
}
