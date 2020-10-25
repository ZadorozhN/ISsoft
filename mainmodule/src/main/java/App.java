import org.apache.log4j.Logger;

public class App {
    public static void main(String[] args){
        Person someone = new Person("Nikita", 20);

        Logger logger = Logger.getLogger(App.class);
        logger.debug("This is a debug");
        logger.info("This is an info");
        logger.warn("This is a warn");
        logger.error("This is an error");
        logger.fatal("This is a fatal");
    }
}
