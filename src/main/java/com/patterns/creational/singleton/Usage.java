package main.java.com.patterns.creational.singleton;

/**
 * Использование паттерна Singleton
 */
public class Usage {
    public static void main(String[] args) {
        /* первое получение экземпляра SingletonSimple */
        SingletonSimple simpleOne = SingletonSimple.getInstance();
        System.out.println(simpleOne);

        /* второе получение экземпляра SingletonSimple */
        SingletonSimple simpleTwo = SingletonSimple.getInstance();
        System.out.println(simpleTwo);

        /* первое получение экземпляра SingletonOnLoad */
        SingletonOnLoad onLoadOne = SingletonOnLoad.getInstance();
        System.out.println(onLoadOne);

        /* второе получение экземпляра SingletonOnLoad */
        SingletonOnLoad onLoadTwo = SingletonOnLoad.getInstance();
        System.out.println(onLoadTwo);
    }
}
