package task3and4;

/**
 * Class that represents stuff that could be used for making notes
 */
public abstract class NotingStuff extends TableStuff{
    private int pages;

    public NotingStuff(Brand brand, Color color, double price, int pages) {
        super(brand, color, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + pages + " ";
    }
}
