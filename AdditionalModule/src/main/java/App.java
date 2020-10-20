import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.debug("This is a debug");
        logger.info("This is an info");
        logger.warn("This is a warn");
        logger.error("This is an error");
    }
}
