package main.java.com.patterns.creational.builder.examlpe1;


/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();

        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();

        Computer computer = director.getComputer();
        System.out.println(computer.getDisplay());
        System.out.println(computer.getManipulators());
        System.out.println(computer.getSystemBlock());
    }
}
