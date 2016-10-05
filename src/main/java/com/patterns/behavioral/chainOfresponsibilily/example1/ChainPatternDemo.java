package main.java.com.patterns.behavioral.chainOfresponsibilily.example1;

/**
 * Поведенческий шаблон проектирования, предназначенный для организации в системе уровней ответственности.
 * Шаблон рекомендован для использования в условиях:
 * — в разрабатываемой системе имеется группа объектов, которые могут обрабатывать сообщения определенного типа;
 * — все сообщения должны быть обработаны хотя бы одним объектом системы;
 * — сообщения в системе обрабатываются по схеме «обработай сам либо перешли другому», то есть одни сообщения
 * обрабатываются на том уровне, где они получены, а другие пересылаются объектам иного уровня.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}