package demo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo1 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Demo1.class);
        logger.error("Hello world.");
        logger.warn("Hello world.");
        logger.info("Hello world.");
        logger.debug("Hello world.");
        logger.trace("Hello world.");

        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
