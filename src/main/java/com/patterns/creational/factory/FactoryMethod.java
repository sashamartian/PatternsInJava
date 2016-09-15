package main.java.com.patterns.creational.factory;

import org.w3c.dom.Document;
import java.io.File;

/**
 * Фабрика по созданию объектов.
 */
public class FactoryMethod {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
            writer.write(object);
        } else if (object instanceof Document) {
            writer = new ConcreteXmlWriter();
            writer.write(object);
        }

        return writer;
    }
}
