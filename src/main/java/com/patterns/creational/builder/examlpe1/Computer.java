package main.java.com.patterns.creational.builder.examlpe1;

/**
 * Класс, который в итоге нам нужен.
 */
public class Computer {
    private String display = null;
    private String systemBlock = null;
    private String manipulators = null;

    public void setDisplay(String display) {
        this.display = display;
    }
    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }
    public void setManipulators(String manipulators) {
        this.manipulators = manipulators;
    }

    public String getDisplay() {
        return display;
    }

    public String getSystemBlock() {
        return systemBlock;
    }

    public String getManipulators() {
        return manipulators;
    }
}
