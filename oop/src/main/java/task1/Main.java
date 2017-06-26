package task1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by kpkshke on 25.06.17.
 * Main class of first task of oop module
 */
public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("black", "bic", 20, 0.5);
        Pen pen2 = new Pen("blue", "pilot", 18, 0.4);
        System.out.println("toString:");
        System.out.println(pen1.toString());
        System.out.println(pen2.toString());
        System.out.println("Hashcodes:");
        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
        System.out.println("Are equal?");
        System.out.println(pen1.equals(pen2));

    }

}
