package main.java.com.patterns.creational.factory;

import java.io.File;

/**
 * Используйте паттерн Factory в следующих случаях:
 * - класс не имеет информации о том, какой тип объекта он должен создать;
 * - класс передает ответственность по созданию объектов наследникам;
 * - необходимо создать объект в зависимости от входящих данных.
 */
public class Main {
    public static File file = new File("");
    public static FactoryMethod factoryMethod = new FactoryMethod();

    public static void main(String[] args) {
        AbstractWriter aFile = factoryMethod.getWriter(file);
    }
}
