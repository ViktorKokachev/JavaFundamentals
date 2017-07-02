package task3and4;

/**
 * Class for stuff that could be used for drawing lines
 */
public class DrawingLinesStuff extends TableStuff{

    private int length;

    public DrawingLinesStuff(Brand brand, Color color, double price, int length) {
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
