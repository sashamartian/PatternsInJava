package main.java.com.patterns.creational.prototype.example2;

/*
* Задаёт виды создаваемых объектов с помощью экземпляра-прототипа и создаёт новые объекты путём копирования этого
* прототипа. Он позволяет уйти от реализации и позволяет следовать принципу «программирование через интерфейсы».
* В качестве возвращающего типа указывается интерфейсабстрактный класс на вершине иерархии, а классы наследники могут
* подставить туда наследника, реализующего этот тип.
* Проще говоря, это паттерн создания объекта через клонирование другого объекта вместо создания через конструктор.*/

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
