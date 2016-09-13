package main.java.com.patterns.creational.singleton;

/**
 * Конструктор класса необходимо объявить с модификатором видимости private. Это предотвратит создание экземпляров
 * класса как с помощью класса Singleton, так и с помощью его наследников. В связи с этим к объявлению класса смело
 * можно дописать модификатор final.
 * Метод getInstance() создаст ровно один экземпляр класса Singleton. Этот метод объявлен как synchronized. Сделано это
 * вот почему. В многопоточных программах при одновременном вызове метода getInstance() из нескольких потоков можно
 * создать несколько экземпляров класса Singleton. А должен остаться только один!
 */

public final class SingletonSimple {
    private static SingletonSimple Instance = null;

    private SingletonSimple() {}

    public static synchronized SingletonSimple getInstance() {
        if (Instance == null) {
            Instance = new SingletonSimple();
        }

        return Instance;
    }
}
