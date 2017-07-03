package task6and7;

/**
 * Class for nuclear submarine
 */

public class NuclearSubmarine {
    private NuclerSubmarineEngine engine = new NuclerSubmarineEngine();

    public void startMovement() {
        engine.start();
        System.out.println("Submarine starts its movement");
    }

    private class NuclerSubmarineEngine {
        private void start() {
            System.out.println("Engine was started.");
        }
    }
}
