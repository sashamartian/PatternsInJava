package main.java.com.patterns.other.businessDelegate.example1;

/**
 * Шаблон J2EE — прячет сложности поиска и создания бизнес-сервисов.
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
