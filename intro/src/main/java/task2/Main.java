package task2;

/**
 * Created by kpkshke on 25.06.17.
 * Second task from intro module
 */

public class Main {
    public static void main(String args[]) {

        double epsilon = 0.5;
        int i = 1; // number of min element that satisfy the task
        double temp; // temp variable to calculate a_n only once

        // main logic
        while ((temp = 1.0 / ( (i + 1) * (i + 1) ) ) > epsilon) {
            System.out.print(temp + " ");
            i++;
        }

        output(i);
    }

    // output function
    private static void output (int n) {
        if (n == 1) {
            System.out.println("Your n is 0. Try another epsilon.");
        }
        else {
            System.out.println();
            System.out.println("Your n is " + (n - 1));
        }
    }
}
