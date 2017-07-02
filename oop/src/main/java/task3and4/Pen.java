package task3and4;

/**
 * Class for Pens
 */
public class Pen extends WritingStuff{

    private double rodDiam;

    public Pen(Brand brand, Color color, double price, int length, double rodDiam) {
        super(brand, color, price, length);
        this.rodDiam = rodDiam;
    }

    public double getRodDiam() {
        return rodDiam;
    }

    public void setRodDiam(double rodDiam) {
        this.rodDiam = rodDiam;
    }

    @Override
    public String toString() {
        return super.toString() + rodDiam + " ";
    }
}
