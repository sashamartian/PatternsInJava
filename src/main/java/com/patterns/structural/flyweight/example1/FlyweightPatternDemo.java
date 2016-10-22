package main.java.com.patterns.structural.flyweight.example1;

/**
 * Cтруктурный шаблон проектирования, при котором объект, представляющий себя как уникальный экземпляр в разных местах
 * программы, по факту не является таковым. Flyweight используется для уменьшения затрат при работе с большим
 * количеством мелких объектов. При проектировании приспособленца необходимо разделить его свойства на внешние и
 * внутренние. Внутренние свойства всегда неизменны, тогда как внешние могут отличаться в зависимости от места и
 * контекста применения и должны быть вынесены за пределы приспособленца.
 * Flyweight дополняет шаблон Factory Method таким образом, что при обращении клиента к Factory Method для создания
 * нового объекта ищет уже созданный объект с такими же параметрами, что и у требуемого, и возвращает его клиенту. Если
 * такого объекта нет, то фабрика создаст новый.
 */
public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
