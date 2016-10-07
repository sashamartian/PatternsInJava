package main.java.com.patterns.behavioral.command.example1;

/**
 * Поведенческий шаблон проектирования, используемый при объектно-ориентированном программировании, представляющий
 * действие. Объект команды заключает в себе само действие и его параметры. Цель — создание структуры, в которой
 * класс-отправитель и класс-получатель не зависят друг от друга напрямую. Организация обратного вызова к классу,
 * который включает в себя класс-отправитель.
 * Известен также под именем Action (действие).
 * Обеспечивает обработку команды в виде объекта, что позволяет сохранять её, передавать в качестве параметра методам,
 * а также возвращать её в виде результата, как и любой другой объект.
 * Например, библиотека печати может иметь класс PrintJob. Для его использования можно создать объект PrintJob,
 * установить необходимые параметры, и вызвать метод, непосредственно отсылающий задание на печать.
 */

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}