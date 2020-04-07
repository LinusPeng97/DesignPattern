package main.java.pers.linus.build;

public class VolatileSingleton {
    private volatile static VolatileSingleton instance;

    public static VolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileSingleton.class) {
                instance = new VolatileSingleton();
            }
        }
        return instance;
    }
}
