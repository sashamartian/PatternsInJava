package main.java.com.patterns.structural.composite.example1;

import java.util.List;

/**
 * Структурный шаблон проектирования, объединяющий объекты в древовидную структуру для представления иерархии от
 * частного к целому. Компоновщик позволяет клиентам обращаться к отдельным объектам и к группам объектов одинаково.
 * Паттерн определяет иерархию классов, которые одновременно могут состоять из примитивных и сложных объектов, упрощает
 * архитектуру клиента, делает процесс добавления новых видов объекта более простым.
 */

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : (List<Employee>) CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : (List<Employee>) headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}