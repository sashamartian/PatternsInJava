package main.java.com.patterns.creational.abstractFactory.example1;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}