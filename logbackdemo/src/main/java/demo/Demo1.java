package demo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo1 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Demo1.class);
        for(int i = 0; i < 1; i++) {
            logger.error("Hello world.Demo6");
//            logger.warn("Hello world.Demo1");
//            logger.info("Hello world.Demo1");
//            logger.debug("Hello world.Demo1");
            logger.trace("Hello world.Demo1");
        }

        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
