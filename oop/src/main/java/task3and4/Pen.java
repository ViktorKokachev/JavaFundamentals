package task3and4;

/**
 * Class for Pens
 */
public class Pen extends WritingStuff{

    private int rodDiam;

    public Pen(Brand brand, Color color, double price, int length, int rodDiam) {
        super(brand, color, price, length);
        this.rodDiam = rodDiam;
    }

    public int getRodDiam() {
        return rodDiam;
    }

    public void setRodDiam(int rodDiam) {
        this.rodDiam = rodDiam;
    }
}
