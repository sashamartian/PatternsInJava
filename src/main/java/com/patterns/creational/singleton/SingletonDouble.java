package main.java.com.patterns.creational.singleton;

/**
 * Проблема с lazy инициализацией остается только в том, что синхронизация нужна по идее только один раз, чтобы
 * несколько потоков не вошли в критическую секцию одновременно. Но после создания экземпляра класса от синхронизации
 * хотелось бы избавиться. Самый распространенный способ избавиться от лишней синхронизации - это
 * double-checked locking, который выглядит таким образом:
 */

public class SingletonDouble {
    private static volatile SingletonDouble Instance = null;

    private SingletonDouble() {}

    public static synchronized SingletonDouble getInstance() {
        if (Instance == null)
            synchronized (SingletonDouble.class) {
                if (Instance == null)
                    Instance = new SingletonDouble();
            }
        return Instance;
    }
}
