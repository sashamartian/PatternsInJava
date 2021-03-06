package main.java.com.patterns.structural.bridge.example1;

/**
 * Cтруктурный шаблон проектирования, используемый в проектировании программного обеспечения чтобы «разделять абстракцию
 * и реализацию так, чтобы они могли изменяться независимо». Шаблон bridge (от англ. — мост) использует инкапсуляцию,
 * агрегирование и может использовать наследование для того, чтобы разделить ответственность между классами.
 При частом изменении класса преимущества объектно-ориентированного подхода становятся очень полезными, позволяя делать
 изменения в программе, обладая минимальными сведениями о реализации программы. Шаблон bridge является полезным там, где
 часто меняется не только сам класс, но и то, что он делает.*/

public class Main {
    // BridgePatternDemo
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
