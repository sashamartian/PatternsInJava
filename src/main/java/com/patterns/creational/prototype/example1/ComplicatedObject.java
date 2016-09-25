package main.java.com.patterns.creational.prototype.example1;

/**
 * Объект, реализующий интерфейс
 */
public class ComplicatedObject implements Copyable {
    private String Type;

    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(String type) {
        this.Type = type;
    }
}
