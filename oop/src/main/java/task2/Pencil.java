package task2;

/**
 * Pencil class
 */
public class Pencil extends TableStuff {
    private int rodDiam;

    public Pencil(Brand brand, Color color, int price, int rodDiam) {
        super(brand, color, price);
        this.rodDiam = rodDiam;
    }

    public int getRodDiam() {
        return rodDiam;
    }

    public void setRodDiam(int rodDiam) {
        this.rodDiam = rodDiam;
    }
}
