package task2;

/**
 * Class for notepad
 */
public class Notepad extends TableStuff{
    private int pages;

    public Notepad(Brand brand, Color color, int price, int pages) {
        super(brand, color, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
