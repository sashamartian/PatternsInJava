package main.java.com.patterns.behavioral.observer.example1;

/*
* Поведенческий шаблон проектирования. Также известен как «подчинённые» (Dependents), «издатель-подписчик»
* (Publisher-Subscriber). Создает механизм у класса, который позволяет получать экземпляру объекта этого класса
* оповещения от других объектов об изменении их состояния, тем самым наблюдая за ними */

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
