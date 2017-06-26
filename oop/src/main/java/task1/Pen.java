package task1;

/**
 * Created by kpkshke on 26.06.17.
 * Class that describes Pen
 */
public class Pen {
    private String color;
    private String brand;
    private double length;
    private double diam;

    public Pen(String color, String brand, double length, double diam) {
        this.color = color;
        this.brand = brand;
        this.length = length;
        this.diam = diam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDiam() {
        return diam;
    }

    public void setDiam(double diam) {
        this.diam = diam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.getLength(), getLength()) != 0) return false;
        if (Double.compare(pen.getDiam(), getDiam()) != 0) return false;
        if (getColor() != null ? !getColor().equals(pen.getColor()) : pen.getColor() != null) return false;
        return getBrand() != null ? getBrand().equals(pen.getBrand()) : pen.getBrand() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDiam());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", length=" + length +
                ", diam=" + diam +
                '}';
    }
}
