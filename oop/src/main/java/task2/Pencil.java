package task2;

/**
 * Pencil class
 */
public class Pencil extends TableStuff {
    private boolean isHard;

    public Pencil(Brand brand, Color color, double price, boolean isHard) {
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
