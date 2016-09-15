package main.java.com.patterns.creational.singleton;

/**
 * Использование паттерна Singleton
 */
public class Main {
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

        /* первое получение экземпляра SingletonEnum */
        SingletonEnum enumOne = SingletonEnum.INSTANCE;
        System.out.println(enumOne);

        /* первое получение экземпляра SingletonEnum */
        SingletonEnum enumTwo = SingletonEnum.INSTANCE;
        System.out.println(enumTwo);

        /* пример
         * Теперь для работы с конфигурацией можно использовать конструкцию вида: */
        String propKey = "key";
        String propValue = Configuration.getInstance().getProperty(propKey);
        System.out.println(propValue);

        /* Если имена свойств в "props.txt" меняться не будут, можно описать их в классе таким образом:
         * public static final String PROP_KEY = "propKey";
         * а значения получать так:
         * String propValue = Configuration.getInstance().getProperty(Configuration.PROP_KEY); */

    }
}
