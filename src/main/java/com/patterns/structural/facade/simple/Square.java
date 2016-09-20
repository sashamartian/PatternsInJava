package main.java.com.patterns.structural.facade.simple;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
