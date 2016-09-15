package main.java.com.patterns.creational.factory;

/**
 * Кдасс по обработке типа File.
 */
public class ConcreteFileWriter extends AbstractWriter {
    @Override
    public void write(Object context) {
        // method body
        System.out.println("Write document.");
    }
}
