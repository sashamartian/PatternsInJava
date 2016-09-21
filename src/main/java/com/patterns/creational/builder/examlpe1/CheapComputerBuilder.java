package main.java.com.patterns.creational.builder.examlpe1;

/**
 * Имплементация билдера
 */
public class CheapComputerBuilder  extends ComputerBuilder {
    public void buildSystemBlock() {
        computer.setSystemBlock("Everest");
    }
    public void buildDisplay() {
        computer.setDisplay("CRT");
    }
    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }
}
