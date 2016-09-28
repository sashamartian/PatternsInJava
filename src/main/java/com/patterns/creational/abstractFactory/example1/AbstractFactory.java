package main.java.com.patterns.creational.abstractFactory.example1;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
