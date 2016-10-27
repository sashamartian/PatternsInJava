package main.java.com.patterns.other.interceptingFilter.example1;

/**
 * Шаблон J2EE — обеспечивает централизованную точку входа для управления обработкой запроса.
 * Ситуация — механизм обработки запросов яруса презентации имеет дело с различными типами запросов, требующих разные
 * методы их обработки. Одни запросы просто пересылаются соответствующему компоненту обработчика, а другие перед
 * обработкой необходимо модифицировать, проверить или распаковать.
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
