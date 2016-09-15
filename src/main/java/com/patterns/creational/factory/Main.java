package main.java.com.patterns.creational.factory;

import java.io.File;

/**
 * Использование паттерна Factory
 */
public class Main {
    public static File file = new File("");
    public static FactoryMethod factoryMethod = new FactoryMethod();

    public static void main(String[] args) {
        AbstractWriter aFile = factoryMethod.getWriter(file);
    }
}
