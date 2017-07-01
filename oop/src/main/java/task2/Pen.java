package task2;

/**
 * Class for Pen
 */
public class Pen extends TableStuff{

    private double rodDiam;

    public Pen(Brand brand, Color color, double price, double rodDiam) {
        super(brand, color, price);
        this.rodDiam = rodDiam;
    }

    public double getRodDiam() {
        return rodDiam;
    }

    public void setRodDiam(double rodDiam) {
        this.rodDiam = rodDiam;
    }
}