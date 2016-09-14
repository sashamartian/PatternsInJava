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

        /* первое получение экземпляра SingletonDouble */
        SingletonDouble doubleOne = SingletonDouble.getInstance();
        System.out.println(doubleOne);

        /* второе получение экземпляра SingletonOnLoad */
        SingletonDouble doubleTwo = SingletonDouble.getInstance();
        System.out.println(doubleTwo);

        /* первое получение экземпляра SingletonHolder */
        SingletonHolder holderOne = SingletonHolder.getInstance();
        System.out.println(holderOne);

        /* второе получение экземпляра SingletonHolder */
        SingletonHolder holderTwo = SingletonHolder.getInstance();
        System.out.println(holderTwo);
    }
}
