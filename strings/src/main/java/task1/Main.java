package task1;

/**
 * Main class for the fist task
 */
public class Main {
    public static void main(String[] args) {
        CrazyLogger logger = new CrazyLogger();
        logger.addLog("first");
        logger.addLog("second");
        logger.addLog("third");
        logger.addLog("first");
        logger.addLog("second");

        System.out.println(logger.findList("first"));
        System.out.println(logger.findStrings("second"));
    }
}
