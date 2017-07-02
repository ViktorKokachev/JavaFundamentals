package task3and4;

/**
 * Class for stuff that could be used for writing
 */
public abstract class WritingStuff extends TableStuff{
    private int length;

    public WritingStuff(Brand brand, Color color, double price, int length) {
        super(brand, color, price);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
