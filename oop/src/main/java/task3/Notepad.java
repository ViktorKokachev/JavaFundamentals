package task3;

/**
 * Class for Notepads
 */
public class Notepad extends NotingStuff{

    boolean isFlipingWithRings;

    public Notepad(Brand brand, Color color, double price, int pages, boolean isFlipingWithRings) {
        super(brand, color, price, pages);
        this.isFlipingWithRings = isFlipingWithRings;
    }

    public boolean isFlipingWithRings() {
        return isFlipingWithRings;
    }

    public void setFlipingWithRings(boolean flipingWithRings) {
        isFlipingWithRings = flipingWithRings;
    }


}
