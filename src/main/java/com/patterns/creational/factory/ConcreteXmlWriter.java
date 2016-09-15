package main.java.com.patterns.creational.factory;

/**
 * Кдасс по обработке типа Document.
 */
public class ConcreteXmlWriter extends AbstractWriter {

    @Override
    public void write(Object context) {
        // method body
        System.out.println("Write file.");
    }
}
