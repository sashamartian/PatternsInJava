package main.java.com.patterns.structural.proxy.example1;

/*
* Cтруктурный шаблон проектирования, который предоставляет объект, который контролирует доступ к другому объекту,
* перехватывая все вызовы (выполняет функцию контейнера). Проблема — необходимо управлять доступом к объекту так, чтобы
* не создавать громоздкие объекты «по требованию». Решение — создать суррогат громоздкого объекта.*/
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
