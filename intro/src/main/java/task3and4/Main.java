package task3and4;

/**
 * Created by kpkshke on 26.06.17.
 * Task3 for intro module
 * TODO: use BigDecimal?
 */
public class Main {
    public static void main(String[] args) {
        double a = 1.0; // lower limit of interval
        double b = 2.0; // upper limit of interval
        double h = 0.1; // step
        walkThroughTheInterval(a, b, h);
    }

    // Main logic method
    private static void walkThroughTheInterval (double a, double b, double h) {
        double walker = a; // variable to pass through the whole interval
        while (walker <= b + 0.00001) { // 0.00...1 value is used because of accurancy of java doubles
            System.out.println(walker + " " + func(walker));
            walker += h;
        }
    }

    // Method for calculating F(x)
    private static double func (double x) {
        return Math.tan(2*x) - 3;
    }

}


