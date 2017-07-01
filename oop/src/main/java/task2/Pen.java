package task2;

/**
 * Class for Pen
 */
public class Pen extends TableStuff{

    private boolean isHard;

    public Pen(Brand brand, Color color, int price, boolean isHard) {
        super(brand, color, price);
        this.isHard = isHard;
    }

    public boolean isHard() {
        return isHard;
    }

    public void setHard(boolean hard) {
        isHard = hard;
    }
}