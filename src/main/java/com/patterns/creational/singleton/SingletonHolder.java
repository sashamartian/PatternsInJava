package main.java.com.patterns.creational.singleton;

/**
 * Created by sbt-galushkin-aa on 14.09.2016.
 */
public class SingletonHolder {
    private SingletonHolder() {}

    private static class Holder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }
}
