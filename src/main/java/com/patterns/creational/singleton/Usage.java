package main.java.com.patterns.creational.singleton;

/**
 * Использование паттерна Singleton
 */
public class Usage {
    public static void main(String[] args) {
        /* первое получение экземпляра */
        SingletonSimple simpleOne = SingletonSimple.getInstance();
        System.out.println(simpleOne);

        /* второе получение экземпляра */
        SingletonSimple simpleTwo = SingletonSimple.getInstance();
        System.out.println(simpleTwo);
    }
}
