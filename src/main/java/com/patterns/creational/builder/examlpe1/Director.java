package main.java.com.patterns.creational.builder.examlpe1;

/**
 * Зачем вообще создавать этот класс, ведь можно сразу вызывать методы Builder'a из клиента? Класс Director делает
 * комплексное построение продукта (в нашем случае компьютера) и не заботиться о том, как именно создаются его части.
 */
public class Director {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.createNewComputer();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();
    }
}
