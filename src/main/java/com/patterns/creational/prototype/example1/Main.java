package main.java.com.patterns.creational.prototype.example1;

/**
 * Шаблон Prototype позволяет создавать новые объекты на основе некоторого объекта-прототипа при этом совсем не
 * обязательно знать как необходимый объект устроен.
 * Вот некоторые ситуации когда может помочь этот паттерн проектирования:
 * - если создание объектов (через оператор new) занимает длительный промежуток времени или требовательно к памяти;
 * - если создание объектов для клиента является нетривиальной задачей, например, когда объект составной;
 * - избежать множества фабрик для создания конкретных экземпляров классов;
 * - если клиент не знает специфики создания объекта.
 * В Java уже заложена функциональность для имплементации паттерна Прототип - интерфейс Cloneable.
 */
public class Main {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();

        ComplicatedObject cloneOne = prototype.copy();
        cloneOne.setType("One");

        ComplicatedObject cloneTwo = prototype.copy();
        cloneTwo.setType("Two");
    }
}
