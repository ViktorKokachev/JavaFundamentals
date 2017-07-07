package task6and7;

/**
 * Class for nuclear submarine
 */

@Annot(
        author =  "Viktor Kokachev",
        date = "07.07.2016",
        version = "0.1"
)

public class NuclearSubmarine {
    private NuclearSubmarineEngine engine = new NuclearSubmarineEngine();

    public void startMovement() {
        engine.start();
        System.out.println("Submarine starts its movement");
    }

    private class NuclearSubmarineEngine {
        private void start() {
            System.out.println("Engine was started.");
        }
    }
}
