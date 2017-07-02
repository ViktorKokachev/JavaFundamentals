package task3and4;

/**
 * Class for pencils
 */
public class Pencil extends WritingStuff{
    boolean isHard;

    public Pencil(Brand brand, Color color, double price, int length, boolean isHard) {
        super(brand, color, price, length);
        this.isHard = isHard;
    }

    public boolean isHard() {
        return isHard;
    }

    public void setHard(boolean hard) {
        isHard = hard;
    }
}
