package main.java.com.patterns.behavioral.nullObject.example1;

/**
 * В таких объектно-ориентированных языках как Java или C# объекты могут иметь значение NULL. Ссылки на такие объекты
 * нуждаются в проверке на NULL-значение перед использованием, так как методы класса «нулевого» объекта, как правило,
 * не могут вызываться.
 * Целью Null-object является инкапсулирование отсутствия объекта путем замещения его другим объектом, который ничего
 * не делает.
 * Данный шаблон проектирования рекомендуется ипользовать, когда:
 * — Объект требует взаимодействия с другими объектами. Null Object не устанавливает нового взаимодействия — он
 * использует уже установленное взаимодействие.
 * — Какие-то из взаимодействующих объектов должны бездействовать
 * — Требуется абстрагирование «общения» с объектами, имеющими NULL-значение.
 */
public class Main {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
