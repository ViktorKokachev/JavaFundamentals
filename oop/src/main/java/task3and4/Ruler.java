package task3and4;

/**
 * Class for Ruler
 */
public class Ruler extends DrawingLinesStuff{

    private boolean isMadeOfWood;

    public Ruler(Brand brand, Color color, double price, int length, boolean isMadeOfWood) {
        super(brand, color, price, length);
        this.isMadeOfWood = isMadeOfWood;
    }

    public boolean isMadeOfWood() {
        return isMadeOfWood;
    }

    public void setMadeOfWood(boolean madeOfWood) {
        isMadeOfWood = madeOfWood;
    }

    @Override
    public String toString() {
        return super.toString() + isMadeOfWood;
    }
}
