import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;
import java.util.Locale;

class Logging{

    public static void main(String[] args) {
        Configurator.initialize(new DefaultConfiguration());
        Configurator.setRootLevel(Level.WARN);
        Logger logger = LogManager.getLogger(Logging.class.getName());
        logger.debug("Hello, this is a debug message");
        logger.info("Hello, this is an info message");
        logger.error("Unable to process request", new Exception("Parsing error"));
        logger.info("Name: {}, Locale: {}", "Victoria", Locale.UK);
    }

}