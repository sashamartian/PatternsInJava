package main.java.com.patterns.creational.singleton;

/**
 * От модификатора synchronized из SingletonSimple можно избавиться. Для этого Instance нужно проинициализировать:
 * private static final SingletonOnLoad Instance = new SingletonOnLoad();
 * а в методе getInstance() убрать конструкцию "if". Тогда инициализация произойдет во время загрузки класса.
 * Но использование поздней инициализации (lazy initialization) предпочтительнее в случае, если создание экземпляра
 * класса занимает много времени. Да и в случае ленивой инициализации есть возможность обработать возникшие
 * исключитальные ситуации при вызове конструктора.
 */

public class SingletonOnLoad {
    private static final SingletonOnLoad Instance = new SingletonOnLoad();

    private SingletonOnLoad() {}

    public static synchronized SingletonOnLoad getInstance() {
        return Instance;
    }
}
