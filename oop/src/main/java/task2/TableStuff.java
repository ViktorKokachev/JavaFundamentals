package task2;

/**
 * Class that represents abstact tablestuff
 */

public abstract class TableStuff {

    private Brand brand;
    private Color color;
    private double price;

    public TableStuff(Brand brand, Color color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
